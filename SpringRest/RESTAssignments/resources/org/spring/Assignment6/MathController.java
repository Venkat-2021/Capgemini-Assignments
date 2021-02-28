package org.spring.Assignment6;

import org.spring.service.MathOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {
	
	@RequestMapping(value="/math", method=RequestMethod.POST)
	public void math (@RequestBody MathOperation math) {
		math.add(5, 6);
		
	}
	

}
