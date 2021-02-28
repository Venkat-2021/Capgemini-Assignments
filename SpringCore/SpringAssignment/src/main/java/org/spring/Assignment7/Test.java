package org.spring.Assignment7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	 public static void main( String[] args )
	    {
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.spring.Assignment7");
		context.refresh();
		MathOperations details = context.getBean(MathOperations.class);

		details.printMathOperations();
		context.close();
	    }

}
