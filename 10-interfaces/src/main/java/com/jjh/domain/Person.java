package com.jjh.domain;

public class Person implements Speaker {
	
	@Override
	public void saySomething() {
		System.out.println("Person - Howdy");
	}
	
}
