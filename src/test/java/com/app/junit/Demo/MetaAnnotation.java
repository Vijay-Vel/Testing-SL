package com.app.junit.Demo;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target({ElementType.TYPE, ElementType.METHOD}) 
@Retention(RetentionPolicy.RUNTIME)
@Tag("dev")  
@Test  
public @interface MetaAnnotation {

}
