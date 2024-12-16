package com.example.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


import java.util.Arrays;
import java.util.List;

public class AccountTypeValidator implements ConstraintValidator<ValidateAccountType, String> {
    @Override
    public boolean isValid(String employeeType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> employeeTypes = Arrays.asList("Saving", "Current");
        return employeeTypes.contains(employeeType);
    }
}