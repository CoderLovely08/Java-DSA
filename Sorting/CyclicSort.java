package com.datastructures.Sorting;

import java.util.Arrays;

public class CyclicSort {
  static int[] cyclicSort(int[] arr) {
    int[] ans = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] - 1 == i) {
        
      //ans[arr[i] - 1] = arr[i];
      } else {
        int temp = arr[i];
        arr[i] = arr[arr[i] - 1];
        arr[arr[i] - 1] = temp;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {3, 2, 1, 4, 5};
    System.out.print(Arrays.toString(cyclicSort(arr)));
  }
}
