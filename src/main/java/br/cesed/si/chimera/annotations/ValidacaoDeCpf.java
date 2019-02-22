package br.cesed.si.chimera.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import br.cesed.si.chimera.validations.CpfValidation;

@Constraint(validatedBy = CpfValidation.class)
@Retention(RUNTIME)
@Target({ FIELD, PARAMETER })
public @interface ValidacaoDeCpf {
	
	String message() default "Cpf Vazio";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}
