package zupedu.com.example.nossabiblioteca.utils;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;


@Documented
@Constraint(validatedBy = {UniqueValueValidator.class})
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueValue {

    //default se falhar
    String message() default "Campo já cadastrado no Banco de Dados";
    //validação para grupo especifico ( ex.: adminsitradores , nao admin)
    Class<?>[] groups() default { };
    //info a mais para a validação
    Class<? extends Payload>[] payload() default { };
    String fieldName();
    Class<?> domainClass();
}
