package com.example.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = AccountTypeValidator.class)
public @interface ValidateAccountType {
    public String message() default "Invalid accountType: It should be either Saving Or Current";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}