
package com.puc.tcc.eacademy.disciplina;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.puc.tcc.eacademy.model.BaseEntity;


@Entity
@Table(name = "disciplinas")
public class Disciplina extends BaseEntity {


    @Column(name = "disciplina_date")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date;


    @NotEmpty
    @Column(name = "description")
    private String description;


    @Column(name = "curriculo_id")
    private Integer curriculoId;



    public Disciplina() {
        this.date = new Date();
    }



    public Date getDate() {
        return this.date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getDescription() {
        return this.description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getCurriculoId() {
        return this.curriculoId;
    }


    public void setCurriculoId(Integer curriculoId) {
        this.curriculoId = curriculoId;
    }

}
