package com.puc.tcc.eacademy.professor;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;


public interface ProfessorRepository extends Repository<Professor, Integer> {


    @Transactional(readOnly = true)
    @Cacheable("professores")
    Collection<Professor> findAll() throws DataAccessException;


}
