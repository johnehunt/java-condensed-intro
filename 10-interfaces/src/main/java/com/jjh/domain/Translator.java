package com.jjh.domain;

public interface Translator {
	default void sayHello() {
        System.out.println("Actor - Bonjour");
    }
}
