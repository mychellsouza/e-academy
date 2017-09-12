package com.puc.tcc.eacademy.curso;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface CursoRepository extends Repository<Curso, Integer> {

    @Query("SELECT DISTINCT curso FROM Curso curso left join fetch curso.curriculos WHERE curso.name LIKE :name%")
    @Transactional(readOnly = true)
    Collection<Curso> findByName(@Param("name") String name);

    @Query("SELECT curso FROM Curso curso left join fetch curso.curriculos WHERE curso.id =:id")
    @Transactional(readOnly = true)
    Curso findById(@Param("id") Integer id);

    void save(Curso curso);


}
