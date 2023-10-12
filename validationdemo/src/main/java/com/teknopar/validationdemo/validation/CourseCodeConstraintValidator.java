package com.teknopar.validationdemo.validation;

import com.teknopar.validationdemo.model.Customer;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;
    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        if (theCode != null){
            return theCode.startsWith(coursePrefix);
        }
        else {
            return true;
        }
    }
}
