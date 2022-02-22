package com.company;

public class Chiuaua extends Dog{

  public void bark() {
    System.out.println("Bark");
  }

  @Override
  public void eat(int quantity) {
    System.out.println("The chiuaua has eaten " + quantity + " steaks");
  }

}
