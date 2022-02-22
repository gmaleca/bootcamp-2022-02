package com.company;

public class MyImmutableClassBuilder {

  private Dog dog = new Dog();
  private int age;
  private String name;

  public MyImmutableClassBuilder setDog(Dog dog) {
    this.dog = dog;
    return this;
  }

  public MyImmutableClassBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public MyImmutableClassBuilder setName(String name) {
    this.name = name;
    return this;
  }

  public MyImmutableClass build() {
    return new MyImmutableClass(dog, age, name);
  }


}
