package com.datastructures;

import java.util.ArrayList;

public class ArrayListPractice {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList(5);
    list.add(5);
    list.add(5);
    list.add(6);
    list.add(7);
    list.set(0, 4); // update an element
    list.remove(2); // remove using index
    list.get(2); // accessing an element

    System.out.println(list.lastIndexOf(5));
    System.out.print(list);

    System.out.println();

    // Multi ArrayList
    ArrayList<ArrayList<Integer>> list1 = new ArrayList(5);
    for (int i = 0; i < 3; i++) {
      list1.add(new ArrayList<>());
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        list1.get(i).add(i * j);
      }
    }
    System.out.print(list1);
  }
}
