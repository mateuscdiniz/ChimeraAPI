package br.cesed.si.chimera.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.constraints.NotEmpty;

public class CpfValidation implements ConstraintValidator<NotEmpty,String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		try {
			if(value == "") {
				return false;}
				else {
				return true;}
		} catch (NullPointerException e) {
			return false;
		}
		
	}

}
