package com.puc.tcc.eacademy.professor;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.puc.tcc.eacademy.model.NamedEntity;


@Entity
@Table(name = "turmas")
public class Turma extends NamedEntity implements Serializable {

}
