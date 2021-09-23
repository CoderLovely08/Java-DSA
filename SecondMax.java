package com.datastructures;

import java.util.Arrays;

public class SecondMax {
  // second max in an array
  static int secondMax(int arr[]) {
    int first, second;
    first = second = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (first < arr[i]) {
        second = first;
        first = arr[i];
        //  continue;
      } else if (second < arr[i]) {
        second = arr[i];
      }
    }
    return second;
  }

  // Max in an array
  static int max(int arr[]) {
    int max = Integer.MIN_VALUE;
    for (int i : arr) {
      if (max < i) {
        max = i;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int[] arr = {3, 2, 8, 9, 7, 2};
    // System.out.print(max(arr));
    System.out.print(secondMax(arr));
  }
}
