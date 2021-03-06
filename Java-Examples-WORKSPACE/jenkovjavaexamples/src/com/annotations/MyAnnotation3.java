package com.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
public @interface MyAnnotation3 {
	String value();
}

/*
 * - @Target You can specify which Java elements your custom annotation can be
 * used to annotate. You do so by annotating your annotation definition with
 * the @Target annotation.
 * 
 * - The ElementType class contains the following possible targets:

		ElementType.ANNOTATION_TYPE
		ElementType.CONSTRUCTOR
		ElementType.FIELD
		ElementType.LOCAL_VARIABLE
		ElementType.METHOD
		ElementType.PACKAGE
		ElementType.PARAMETER
		ElementType.TYPE
 */