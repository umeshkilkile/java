package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
	String value() default "";
}

/*
 * RetentionPolicy.RUNTIME
 * 
 * - This is what signals to the Java compiler and JVM that the annotation
 * should be available via reflection at runtime.
 * 
 * 
 * RetentionPolicy.CLASS
 * 
 * - RetentionPolicy.CLASS means that the annotation is stored in the .class
 * file, but not available at runtime. This is the default retention policy, if
 * you do not specify any retention policy at all.
 * 
 * RetentionPolicy.SOURCE
 * 
 * - RetentionPolicy.SOURCE means that the annotation is only available in the
 * source code, and not in the .class files and not a runtime. If you create
 * your own annotations for use with build tools that scan the code, you can use
 * this retention policy. That way the .class files are not polluted
 * unnecessarily.
 */