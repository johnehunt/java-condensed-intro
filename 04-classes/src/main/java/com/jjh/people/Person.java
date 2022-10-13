package com.jjh.people;

/**
 * Class representing a Person object
 * <p>
 * <b>Status:</b> Draft
 * </p>
 * @author John Hunt Initial Development
 * @version 1.0
 **/
public class Person {
    // instance variables
    private int age;
    private String name;

    // a constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 0);
    }

    public Person() {
        this("John");
    }


}
