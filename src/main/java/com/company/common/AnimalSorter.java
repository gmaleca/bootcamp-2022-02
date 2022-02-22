package com.company.common;

import com.company.interfaces.SortableAnimals;

public class AnimalSorter {

  public int compare(SortableAnimals a1, SortableAnimals a2) {

    System.out.println("First animal's age is: " + a1.getAge("", 1));
    System.out.println("Second animal's age is: " + a2.getAge("", 1));

    return a1.getAge("Red", 11) - a2.getAge("Green", 23);
  }

}
