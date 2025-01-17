package com.example.psbogroup3.validation;

import com.example.psbogroup3.validation.validator.JobMustExistValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = JobMustExistValidator.class)
@Documented

public @interface JobMustExist {
    String message();

    String[] path() default {};

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default{};
}
