package com.spring.rabbitmq.dto;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Configuration
@Document(collection="customer")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Customer {
		
		@Id
		private String customid;
		private String custName;		
}
