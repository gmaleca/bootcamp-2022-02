package com.company;

public class MyImmutableClass {

  private final Dog dog;
  private final int age;
  private final String name;

  public MyImmutableClass(Dog dog, int age, String name) {
    this.dog = dog;
    this.age = age;
    this.name = name;
  }

  public Dog getDog() {
    Dog result = new Dog();
    result.A = this.dog.A;
    result.B = this.dog.B;
    result.C = this.dog.C;
    result.l = this.dog.l;
    return result;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

}
