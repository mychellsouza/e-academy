package com.puc.tcc.eacademy.curso;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

public interface CurriculoRepository extends Repository<Curriculo, Integer> {

    @Query("SELECT ptype FROM CurriculoType ptype ORDER BY ptype.name")
    @Transactional(readOnly = true)
    List<CurriculoType> findCurriculoTypes();

    @Transactional(readOnly = true)
    Curriculo findById(Integer id);

    void save(Curriculo curriculo);

}

