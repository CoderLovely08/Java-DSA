package com.datastructures;

import java.util.Arrays;
import java.util.Collections;

public class GreatestCandies {

  static boolean[] findGreatest(Integer arr[], int candies) {
    boolean[] myarr = new boolean[5];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] + candies >= Collections.max(Arrays.asList(arr))) {
        myarr[i] = true;
      } else {
        myarr[i] = false;
      }
    }
    return myarr;
  }

  public static void main(String[] args) {
    Integer[] arr = {2, 3, 5, 1, 3};
    System.out.print(Arrays.toString(findGreatest(arr, 3)));
  }
}
