package com.puc.tcc.eacademy.professor;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Professores {

    private List<Professor> professores;

    @XmlElement
    public List<Professor> getProfessorList() {
        if (professores == null) {
            professores = new ArrayList<>();
        }
        return professores;
    }

}
