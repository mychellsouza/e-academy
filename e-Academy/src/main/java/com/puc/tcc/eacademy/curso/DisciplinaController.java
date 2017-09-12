package com.puc.tcc.eacademy.curso;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.puc.tcc.eacademy.disciplina.Disciplina;
import com.puc.tcc.eacademy.disciplina.DisciplinaRepository;

@Controller
class DisciplinaController {

    private final DisciplinaRepository disciplinas;
    private final CurriculoRepository curriculos;


    @Autowired
    public DisciplinaController(DisciplinaRepository disciplinas, CurriculoRepository curriculos) {
        this.disciplinas = disciplinas;
        this.curriculos = curriculos;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @ModelAttribute("disciplina")
    public Disciplina loadCurriculoWithDisciplina(@PathVariable("curriculoId") int curriculoId, Map<String, Object> model) {
        Curriculo curriculo = this.curriculos.findById(curriculoId);
        model.put("curriculo", curriculo);
        Disciplina disciplina = new Disciplina();
        curriculo.addDisciplina(disciplina);
        return disciplina;
    }

    @RequestMapping(value = "/cursos/*/curriculos/{curriculoId}/disciplinas/new", method = RequestMethod.GET)
    public String initNewDisciplinaForm(@PathVariable("curriculoId") int curriculoId, Map<String, Object> model) {
        return "curriculos/createOrUpdateDisciplinaForm";
    }

    @RequestMapping(value = "/cursos/{cursoId}/curriculos/{curriculoId}/disciplinas/new", method = RequestMethod.POST)
    public String processNewDisciplinaForm(@Valid Disciplina disciplina, BindingResult result) {
        if (result.hasErrors()) {
            return "curriculos/createOrUpdateDisciplinaForm";
        } else {
            this.disciplinas.save(disciplina);
            return "redirect:/cursos/{cursoId}";
        }
    }

}
