package com.teknopar.validationdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class) //asıl sınıfımızı yazdık
@Target({ElementType.METHOD,ElementType.FIELD}) //oluşturuduğumuz bu yeni anatasyonu nerelere uygulayabileceğimizi belirtiyoruz
@Retention(RetentionPolicy.RUNTIME) //kod çalıştığı sürece anatasyonun kullanılmasını sağlar
public @interface CourseCode {  //@İnterface ile özel bir yapı olduğunu belirttik

    public String value() default "TEKNOPAR";
    public String message() default "must start with TEKNOPAR";
    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
