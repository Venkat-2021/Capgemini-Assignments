package org.spring.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring2.xml");
		Question question = (Question)context.getBean("Question");
		question.displayInfo();
		

	}

}
