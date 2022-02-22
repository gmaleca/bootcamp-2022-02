package com.company;

import com.company.interfaces.SortableAnimals;

public class SortableDog extends Dog implements SortableAnimals {


  public SortableDog() {
  }

  public SortableDog(long age) {
    this.l = age;
  }

  @Override
  public int getAge(String c, int w) {
    return (int) l;
  }
}
