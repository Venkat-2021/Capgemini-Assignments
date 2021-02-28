package org.spring.Assignment6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	 public static void main( String[] args )
	    {
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.spring.Assignment6");
		context.refresh();
		DbDetails details = context.getBean(DbDetails.class);

		details.printDBConfigs();
		context.close();
	    }

}
