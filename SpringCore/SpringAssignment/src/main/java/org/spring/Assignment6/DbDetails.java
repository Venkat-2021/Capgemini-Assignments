package org.spring.Assignment6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class DbDetails {
	@Value("${Driver}")
	private String driverClass;
	@Value("${Url}")
	private String dbURL;
	@Value("${Usname}")
	private String userName;
	@Value("${Pass}")
	private char[] password;
	public void printDBConfigs() {
		System.out.println("Driver Class = " + driverClass);
		System.out.println("DB URL = " + dbURL);
		System.out.println("User Name = " + userName);
		System.out.println("Password = " + String.valueOf(password));
	}

}
