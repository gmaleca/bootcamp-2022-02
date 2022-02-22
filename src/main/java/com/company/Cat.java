package com.company;

import com.company.interfaces.SortableAnimals;

public class Cat extends Mamal implements SortableAnimals {

  @Override
  public void eat(int quantity) {
    System.out.println("The cat has eaten " + quantity + " fishes");
  }

  public int sleep(int time, String place) {
    System.out.println();
    return 0;
  }

  public String sleep(String d, int f) {
    System.out.println();
    return "dddd";
  }

  @Override
  public int getAge(String color, int numberOfOffsprings) {
    return 3;
  }
}
