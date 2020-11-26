package com.jjh.people;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("John", 56);
		System.out.println(p);
		
		System.out.println(p.getName() + " is " + p.getAge());
		p.setAge(57);
		System.out.println(p.getName() + " is " + p.getAge());
		
		System.out.println(p);
		
		Person p1 = new Person("John", 56);
		Person p2 = new Person("Denise", 53);
		Person p3 = new Person("Phoebe", 23);
		Person p4 = new Person("Adam", 21);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
