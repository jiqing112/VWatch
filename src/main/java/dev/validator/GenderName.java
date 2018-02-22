package dev.validator;


import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.FIELD)
@Documented
public @interface GenderName {
    String message() default "输入男或者女";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
