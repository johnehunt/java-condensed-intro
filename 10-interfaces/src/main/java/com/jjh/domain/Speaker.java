package com.jjh.domain;

public interface Speaker {
	
	void saySomething();
	
	default void sayHello() {
		System.out.println("Speaker - Hello World");
	}
}
