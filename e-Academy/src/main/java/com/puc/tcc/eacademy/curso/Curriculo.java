package com.puc.tcc.eacademy.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.format.annotation.DateTimeFormat;

import com.puc.tcc.eacademy.disciplina.Disciplina;
import com.puc.tcc.eacademy.model.NamedEntity;

@Entity
@Table(name = "curriculos")
public class Curriculo extends NamedEntity {

    @Column(name = "vigencia_date")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date vigenciaDate;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private CurriculoType type;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curriculoId", fetch = FetchType.EAGER)
    private Set<Disciplina> disciplinas = new LinkedHashSet<>();

    public void setVigenciaDate(Date vigenciaDate) {
        this.vigenciaDate = vigenciaDate;
    }

    public Date getVigenciaDate() {
        return this.vigenciaDate;
    }

    public CurriculoType getType() {
        return this.type;
    }

    public void setType(CurriculoType type) {
        this.type = type;
    }

    public Curso getCurso() {
        return this.curso;
    }

    protected void setCurso(Curso curso) {
        this.curso = curso;
    }

    protected Set<Disciplina> getDisciplinasInternal() {
        if (this.disciplinas == null) {
            this.disciplinas = new HashSet<>();
        }
        return this.disciplinas;
    }

    protected void setDisciplinasInternal(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        List<Disciplina> sortedDisciplinas = new ArrayList<>(getDisciplinasInternal());
        PropertyComparator.sort(sortedDisciplinas,
                new MutableSortDefinition("date", false, false));
        return Collections.unmodifiableList(sortedDisciplinas);
    }

    public void addDisciplina(Disciplina disciplina) {
        getDisciplinasInternal().add(disciplina);
        disciplina.setCurriculoId(this.getId());
    }

}
