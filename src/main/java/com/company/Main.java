package com.company;

import com.company.common.AnimalSorter;

public class Main {
  public static void main(String[] args) {
    
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();

    Dog dog1 = new Dog();
    Dog dog2 = new Dog();

    SortableDog sd1 = new SortableDog(1);
    SortableDog sd2 = new SortableDog();

    AnimalSorter sorter = new AnimalSorter();

    sorter.compare(cat1,cat2);
    sorter.compare(sd1, sd2);

    sorter.compare(
        (c, d) ->  dog1.drink(1),
        (String c, int d) -> {
          System.out.println("We entered lambda expression");
          System.out.println("Color: " + c);
          System.out.println("Number of offsprings: " + d);
          return 10;
        }
    );

  }

}
