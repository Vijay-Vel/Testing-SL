package com.app.junit.Demo;

import java.lang.annotation.Annotation;

public class MyAnnotationDemo implements MetaAnnotation {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@MetaAnnotation
	public void testannotation()
	{
		System.out.println("This method is executed by my Annotation");
	}
	
	
}
