package com.datastructures.Sorting;

import java.util.Arrays;

public class BubbleSort {

  static int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    System.out.print(Arrays.toString(bubbleSort(arr)));
  }
}
