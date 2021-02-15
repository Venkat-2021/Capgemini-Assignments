package org.spring.Assignment1;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Customer customer = (Customer) context.getBean("Customer");
    	customer.displayInfo();
    	
    }
}
