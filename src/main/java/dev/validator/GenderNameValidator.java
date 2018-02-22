package dev.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderNameValidator implements ConstraintValidator<GenderName, String> {
    @Override
    public void initialize(GenderName genderName) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == "男" || s == "女")
            return true;
        return false;
    }
}
