package org.spring.Assignment5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test class 
 *
 */
public class Test {
    public static void main( String[] args )
    {
      
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring5.xml");
        Employee employee = (Employee) context.getBean("Employee");
    	employee.displayInfo();
    	
    }
}
