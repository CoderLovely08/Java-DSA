package com.datastructures.Sorting;

import java.util.Arrays;

public class SelectionSort {
  static int[] sort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        System.out.println("comparing " + arr[i] + " with " + arr[j]);
        if (arr[i] > arr[j]) {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
          System.out.println("swapped " + arr[i] + " with " + arr[j]);
        }
        System.out.println("\n" + Arrays.toString(arr));
      }
      System.out.println("\nArray after pass " + (i + 1) + " " + Arrays.toString(arr));
    }
    return arr;
  }
  
  public static void main(String[] args) {
    int[] arr = {4, 2, 6, 89, 1, 3};
    System.out.println(Arrays.toString(arr));
    System.out.print(Arrays.toString(sort(arr)));
  }
}
