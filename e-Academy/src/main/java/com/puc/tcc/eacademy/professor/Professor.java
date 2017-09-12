package com.puc.tcc.eacademy.professor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

import com.puc.tcc.eacademy.model.Person;

@Entity
@Table(name = "professores")
public class Professor extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "professor_turmas", joinColumns = @JoinColumn(name = "professor_id"), inverseJoinColumns = @JoinColumn(name = "turma_id"))
    private Set<Turma> turmas;

    protected Set<Turma> getTurmasInternal() {
        if (this.turmas == null) {
            this.turmas = new HashSet<>();
        }
        return this.turmas;
    }

    protected void setTurmasInternal(Set<Turma> turmas) {
        this.turmas = turmas;
    }

    @XmlElement
    public List<Turma> getTurmas() {
        List<Turma> sortedSpecs = new ArrayList<>(getTurmasInternal());
        PropertyComparator.sort(sortedSpecs,
                new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedSpecs);
    }

    public int getNrOfTurmas() {
        return getTurmasInternal().size();
    }

    public void addTurma(Turma turma) {
        getTurmasInternal().add(turma);
    }

}
