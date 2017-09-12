package com.puc.tcc.eacademy.curso;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cursos/{cursoId}")
class CurriculoController {

    private static final String VIEWS_CURRRICULOS_CREATE_OR_UPDATE_FORM = "curriculos/createOrUpdateCurriculoForm";
    private final CurriculoRepository curriculos;
    private final CursoRepository cursos;

    @Autowired
    public CurriculoController(CurriculoRepository curriculos, CursoRepository cursos) {
        this.curriculos = curriculos;
        this.cursos = cursos;
    }

    @ModelAttribute("types")
    public Collection<CurriculoType> populateCurriculoTypes() {
        return this.curriculos.findCurriculoTypes();
    }

    @ModelAttribute("curso")
    public Curso findCurso(@PathVariable("cursoId") int cursoId) {
        return this.cursos.findById(cursoId);
    }

    @InitBinder("curso")
    public void initCursoBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @InitBinder("curriculo")
    public void initCurriculoBinder(WebDataBinder dataBinder) {
        dataBinder.setValidator(new CurriculoValidator());
    }

    @RequestMapping(value = "/curriculos/new", method = RequestMethod.GET)
    public String initCreationForm(Curso curso, ModelMap model) {
        Curriculo curriculo = new Curriculo();
        curso.addCurriculo(curriculo);
        model.put("curriculo", curriculo);
        return VIEWS_CURRRICULOS_CREATE_OR_UPDATE_FORM;
    }

    @RequestMapping(value = "/curriculos/new", method = RequestMethod.POST)
    public String processCreationForm(Curso curso, @Valid Curriculo curriculo, BindingResult result, ModelMap model) {
        if (StringUtils.hasLength(curriculo.getName()) && curriculo.isNew() && curso.getCurriculo(curriculo.getName(), true) != null){
            result.rejectValue("name", "duplicate", "already exists");
        }
        if (result.hasErrors()) {
            model.put("curriculo", curriculo);
            return VIEWS_CURRRICULOS_CREATE_OR_UPDATE_FORM;
        } else {
            curso.addCurriculo(curriculo);
            this.curriculos.save(curriculo);
            return "redirect:/cursos/{cursoId}";
        }
    }

    @RequestMapping(value = "/curriculos/{curriculoId}/edit", method = RequestMethod.GET)
    public String initUpdateForm(@PathVariable("curriculoId") int curriculoId, ModelMap model) {
        Curriculo curriculo = this.curriculos.findById(curriculoId);
        model.put("curriculo", curriculo);
        return VIEWS_CURRRICULOS_CREATE_OR_UPDATE_FORM;
    }

    @RequestMapping(value = "/curriculos/{curriculoId}/edit", method = RequestMethod.POST)
    public String processUpdateForm(@Valid Curriculo curriculo, BindingResult result, Curso curso, ModelMap model) {
        if (result.hasErrors()) {
            curriculo.setCurso(curso);
            model.put("curriculo", curriculo);
            return VIEWS_CURRRICULOS_CREATE_OR_UPDATE_FORM;
        } else {
            curso.addCurriculo(curriculo);
            this.curriculos.save(curriculo);
            return "redirect:/cursos/{cursoId}";
        }
    }

}
