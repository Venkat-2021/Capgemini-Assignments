package org.spring.Assignment7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MathOperations{
	@Value("#{ 2+1 }")
	private String add;
	@Value("#{2*3}")
	private String multiply;
	@Value("#{ 10/2 }")
	private String division;
	@Value("#{10-5}")
	private String sub;
	public void printMathOperations() {
		System.out.println("Addition = " + add);
		System.out.println("Multiply = " + multiply);
		System.out.println("Division = " + division);
		System.out.println("Subraction = " + sub);
	}

}
