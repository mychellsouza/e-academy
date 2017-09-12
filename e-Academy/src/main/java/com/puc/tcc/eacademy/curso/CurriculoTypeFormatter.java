package com.puc.tcc.eacademy.curso;


import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class CurriculoTypeFormatter implements Formatter<CurriculoType> {

    private final CurriculoRepository curriculos;


    @Autowired
    public CurriculoTypeFormatter(CurriculoRepository curriculos) {
        this.curriculos = curriculos;
    }

    @Override
    public String print(CurriculoType curriculoType, Locale locale) {
        return curriculoType.getName();
    }

    @Override
    public CurriculoType parse(String text, Locale locale) throws ParseException {
        Collection<CurriculoType> findCurriculoTypes = this.curriculos.findCurriculoTypes();
        for (CurriculoType type : findCurriculoTypes) {
            if (type.getName().equals(text)) {
                return type;
            }
        }
        throw new ParseException("type not found: " + text, 0);
    }

}
