package com.module2.layersMVC.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class EmployeeRollValidator  implements ConstraintValidator<EmployeeRoleValidation,String> {

    @Override
    public boolean isValid(String inputRole, ConstraintValidatorContext constraintValidatorContext) {

        List<String> roles=List.of("USER","ADMIN");
        return roles.contains(inputRole);

    }
}
