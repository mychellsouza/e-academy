package com.puc.tcc.eacademy.disciplina;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;

import com.puc.tcc.eacademy.model.BaseEntity;


public interface DisciplinaRepository extends Repository<Disciplina, Integer> {

    void save(Disciplina disciplina) throws DataAccessException;

    List<Disciplina> findByCurriculoId(Integer curriculoId);

}
