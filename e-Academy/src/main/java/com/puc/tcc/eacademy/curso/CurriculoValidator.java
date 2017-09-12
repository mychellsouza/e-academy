package com.puc.tcc.eacademy.curso;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class CurriculoValidator implements Validator {

    private static final String REQUIRED = "required";

    @Override
    public void validate(Object obj, Errors errors) {
        Curriculo curriculo = (Curriculo) obj;
        String name = curriculo.getName();
        // name validation
        if (!StringUtils.hasLength(name)) {
            errors.rejectValue("name", REQUIRED, REQUIRED);
        }

        // type validation
        if (curriculo.isNew() && curriculo.getType() == null) {
            errors.rejectValue("type", REQUIRED, REQUIRED);
        }

        // vigencia date validation
        if (curriculo.getVigenciaDate() == null) {
            errors.rejectValue("vigenciaDate", REQUIRED, REQUIRED);
        }
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Curriculo.class.isAssignableFrom(clazz);
    }


}
