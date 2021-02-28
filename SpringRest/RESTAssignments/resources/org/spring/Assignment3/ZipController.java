package org.spring.Assignment3;

import java.util.ArrayList;
import java.util.List;

import org.spring.service.ZipCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipController {
	
	@RequestMapping(value="/zipcodes", method=RequestMethod.POST)
	public List<ZipCode> ZipCodes(@RequestBody ZipCode code) {
		if (code.getZipcode()==500083) {
			code.setState("Telangana");
			code.setCountry("India");
			code.setCity("Hyderabad");
			List<ZipCode> list = new ArrayList<ZipCode>();
			list.add(code);
			return list;
		}
		return null;
	}
	
	

}
