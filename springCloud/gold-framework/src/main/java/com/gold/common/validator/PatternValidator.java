package com.gold.common.validator;

import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName:PatternValidator
 * Function: patten验证实现类
 * Date:     2017年7月19日 下午3:43:38
 * @author   hansong
 */
public class PatternValidator implements ConstraintValidator<Pattern, String> {

	private List<String> matchings;
	
	@Override
	public void initialize(Pattern constraintAnnotation) {
		String matching = constraintAnnotation.matching();
		this.matchings = Arrays.asList(matching.split("\\|"));
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(StringUtils.isBlank(value)){
			return true;
		}else if(matchings.contains(value)){
			return true;
		}
		return false;
	}

}

