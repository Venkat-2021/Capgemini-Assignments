package org.spring.Assignment10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test class 
 *
 */
public class Test {
    public static void main( String[] args )
    {
        //Address address = new Address();
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring10.xml");
        Employee employee = (Employee) context.getBean("Employee");
    	employee.displayInfo();
    	
    }
}
