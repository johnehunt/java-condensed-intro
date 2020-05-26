package com.jjh.domain;

public interface Translator {
	default public void sayHello() {
        System.out.println("Actor - Bonjour");
    }
}
