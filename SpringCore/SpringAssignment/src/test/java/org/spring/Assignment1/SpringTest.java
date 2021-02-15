package org.spring.Assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes=Test.class)
class SpringTest {
	
	@Autowired
	Customer customer;
	
	
	@Test
	void test() {
		System.out.println("TestRunning....");
		customer.getCustomerId();
		assertEquals(101,customer.getCustomerId());
	
		
	}

}
