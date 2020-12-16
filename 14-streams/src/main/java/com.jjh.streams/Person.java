package com.jjh.streams;

public class Person {

  // Class side constants
  private static final int MIN_AGE = 0;
  public static final int MAX_AGE = 120;

  // Class side variables
  private static int count;

  // Class side methods
  public static int getCount() {
    return count;
  }

  // Instance side variables
  private String name;
  private int age;

  // Constructors
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
    count++;
  }

  public Person(String name) {
    this(name, 18);
  }

  public Person() {
    this("John");
  }

  // Instance Methods

  public void birthday() {
    int oldAge = this.age;
    this.age++;
    System.out.println(this.name + " Happy Birthday, you were " +
      oldAge + ", you are now " +
      this.age);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if ((MIN_AGE <= age) && (age <= MAX_AGE)) {
      this.age = age;
    } else {
      System.out.println("Invalid Age");
    }
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Person(" +
      "name='" + name + '\'' +
      ", age=" + age +
      ')';
  }
}
