package com.puc.tcc.eacademy.curso;

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
class CursoController {

    private static final String VIEWS_CURSO_CREATE_OR_UPDATE_FORM = "cursos/createOrUpdateCursoForm";
    private final CursoRepository cursos;


    @Autowired
    public CursoController(CursoRepository schoolService) {
        this.cursos = schoolService;
    }

    @InitBinder
    public void setAllowedFields(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }

    @RequestMapping(value = "/cursos/new", method = RequestMethod.GET)
    public String initCreationForm(Map<String, Object> model) {
        Curso curso = new Curso();
        model.put("curso", curso);
        return VIEWS_CURSO_CREATE_OR_UPDATE_FORM;
    }

    @RequestMapping(value = "/cursos/new", method = RequestMethod.POST)
    public String processCreationForm(@Valid Curso curso, BindingResult result) {
        if (result.hasErrors()) {
            return VIEWS_CURSO_CREATE_OR_UPDATE_FORM;
        } else {
            this.cursos.save(curso);
            return "redirect:/cursos/" + curso.getId();
        }
    }

    @RequestMapping(value = "/cursos/find", method = RequestMethod.GET)
    public String initFindForm(Map<String, Object> model) {
        model.put("curso", new Curso());
        return "cursos/findCursos";
    }

    @RequestMapping(value = "/cursos", method = RequestMethod.GET)
    public String processFindForm(Curso curso, BindingResult result, Map<String, Object> model) {


        if (curso.getName() == null) {
            curso.setName(""); 
        }

        Collection<Curso> results = this.cursos.findByName(curso.getName());
        if (results.isEmpty()) {
            result.rejectValue("name", "notFound", "not found");
            return "cursos/findCursos";
        } else if (results.size() == 1) {
            curso = results.iterator().next();
            return "redirect:/cursos/" + curso.getId();
        } else {

            model.put("selections", results);
            return "cursos/cursosList";
        }
    }

    @RequestMapping(value = "/cursos/{cursoId}/edit", method = RequestMethod.GET)
    public String initUpdateCursoForm(@PathVariable("cursoId") int cursoId, Model model) {
        Curso curso = this.cursos.findById(cursoId);
        model.addAttribute(curso);
        return VIEWS_CURSO_CREATE_OR_UPDATE_FORM;
    }

    @RequestMapping(value = "/cursos/{cursoId}/edit", method = RequestMethod.POST)
    public String processUpdateCursoForm(@Valid Curso curso, BindingResult result, @PathVariable("cursoId") int cursoId) {
        if (result.hasErrors()) {
            return VIEWS_CURSO_CREATE_OR_UPDATE_FORM;
        } else {
            curso.setId(cursoId);
            this.cursos.save(curso);
            return "redirect:/cursos/{cursoId}";
        }
    }


    @RequestMapping("/cursos/{cursoId}")
    public ModelAndView showCurso(@PathVariable("cursoId") int cursoId) {
        ModelAndView mav = new ModelAndView("cursos/cursoDetails");
        mav.addObject(this.cursos.findById(cursoId));
        return mav;
    }

}
