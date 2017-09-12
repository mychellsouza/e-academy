package com.puc.tcc.eacademy.professor;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class ProfessorController {

    private final ProfessorRepository professores;

    @Autowired
    public ProfessorController(ProfessorRepository schoolService) {
        this.professores = schoolService;
    }

    @RequestMapping(value = { "/professores.html" })
    public String showProfessorList(Map<String, Object> model) {
        Professores professores = new Professores();
        professores.getProfessorList().addAll(this.professores.findAll());
        model.put("professores", professores);
        return "professores/professoresList";
    }

    @RequestMapping(value = { "/professores.json", "/professores.xml" })
    public @ResponseBody Professores showResourcesProfessorList() {
        Professores professores = new Professores();
        professores.getProfessorList().addAll(this.professores.findAll());
        return professores;
    }

}
