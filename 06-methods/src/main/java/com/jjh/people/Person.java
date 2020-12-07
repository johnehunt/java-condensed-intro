package com.jjh.people;

public class Person {

	// instance variables
	private int age;
	private String name;

	// a constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Another constructor
	public Person(String name) {
		this(name, 0);
	}

	// Another constructor
	public Person() {
		this("John");
	}

	// Methods
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "Person(" + age + ", " + name + ")";
	}
}
