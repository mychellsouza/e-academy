package com.puc.tcc.eacademy.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.core.style.ToStringCreator;

import com.puc.tcc.eacademy.model.BaseEntity;
import com.puc.tcc.eacademy.model.Person;

@Entity
@Table(name = "cursos")
public class Curso extends BaseEntity{

    @Column(name = "tipo")
    @NotEmpty
    private String tipo;

    @Column(name = "name")
    @NotEmpty
    private String name;
	
    @Column(name = "habilitacao")
    @NotEmpty
    private String habilitacao;

    @Column(name = "descricao")
    @NotEmpty
    private String descricao;

    @Column(name = "periodos")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String periodos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
    private Set<Curriculo> curriculos;

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getHabilitacao() {
        return this.habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodos() {
        return this.periodos;
    }

    public void setPeriodos(String periodos) {
        this.periodos = periodos;
    }

    protected Set<Curriculo> getCurriculosInternal() {
        if (this.curriculos == null) {
            this.curriculos = new HashSet<>();
        }
        return this.curriculos;
    }

    protected void setCurriculosInternal(Set<Curriculo> curriculos) {
        this.curriculos = curriculos;
    }

    public List<Curriculo> getCurriculos() {
        List<Curriculo> sortedCurriculos = new ArrayList<>(getCurriculosInternal());
        PropertyComparator.sort(sortedCurriculos, new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedCurriculos);
    }

    public void addCurriculo(Curriculo curriculo) {
        if (curriculo.isNew()) {
            getCurriculosInternal().add(curriculo);
        }
        curriculo.setCurso(this);
    }


    public Curriculo getCurriculo(String name) {
        return getCurriculo(name, false);
    }


    public Curriculo getCurriculo(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Curriculo curriculo : getCurriculosInternal()) {
            if (!ignoreNew || !curriculo.isNew()) {
                String compName = curriculo.getName();
                compName = compName.toLowerCase();
                if (compName.equals(name)) {
                    return curriculo;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return new ToStringCreator(this)

            .append("id", this.getId())
            .append("new", this.isNew())
            .append("name", this.getName())
            .append("tipo", this.getTipo())
            .append("habilitacao", this.habilitacao)
            .append("descricao", this.descricao)
            .append("periodos", this.periodos)
            .toString();
    }
}
