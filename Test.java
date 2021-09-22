package com.datastructures;

import java.util.Arrays;

public class Test {

  public static void fun(int a, int b, int... v) {
    System.out.println(Arrays.toString(v));
    System.out.println(a + " " + b);
  }

  public static void main(String[] args) {
    fun(2, 3, 6, 4, 5);
  }
}
