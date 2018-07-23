package com.gold.common.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * ClassName:Pattern
 * Function: 自定义hibernate验证
 * Date:     2017年7月19日 下午3:41:50
 * @author   hansong
 */
@Constraint(validatedBy = PatternValidator.class)
@Target( { java.lang.annotation.ElementType.METHOD,  java.lang.annotation.ElementType.FIELD })
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface Pattern {
	String message() default "参数不匹配"; //提示信息
    
    String matching();
      
    //下面这两个属性必须添加  
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

