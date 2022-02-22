package com.company;

public class Dog extends Mamal {

  public long l;

  @Override
  public void eat(int quantity) {
    System.out.println("The dog has eaten " + quantity + " bones");
  }

  public int drink(int quantity) {
    System.out.println("The dog has eaten " + quantity + " bones");
    return quantity;
  }

}
