package com.example.demo.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldBean {

	private String message;
	
//	public HelloWorldBean(String message) {
//		this.message = message;
//	}
	
}
