package com.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Test {

  public static void fun(Integer a[]) {
  
  int aa=Collections.max(Arrays.asList(a));
  System.out.print(a[0]);
  }

  public static void main(String[] args) {
      Integer[] arr={1,2,3,4};
      fun(arr);
  }
}
