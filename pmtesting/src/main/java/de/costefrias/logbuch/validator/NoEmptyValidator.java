package de.costefrias.logbuch.validator;

import org.apache.wicket.validation.CompoundValidator;
import org.apache.wicket.validation.validator.PatternValidator;
import org.apache.wicket.validation.validator.StringValidator;

public class NoEmptyValidator extends CompoundValidator<String> {
	
	private static final long serialVersionUID = 1L;

	public NoEmptyValidator() {
	
		add(StringValidator.lengthBetween(3, 55));
		add(new PatternValidator("[a-z0-9_-]+"));
	
	}
}