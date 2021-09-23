package com.datastructures;

import java.util.Arrays;

public class TwoSum {

  // approach 1 with O(n^2)
  static int[] findSum(int arr[], int num) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == num) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
  // approach 2 will use hashmap which i haven't' studied yet with O(n)

  public static void main(String[] args) {
    int[] arr = {33, 0, 4, 6, 7, 33};
    System.out.print(Arrays.toString(findSum(arr, 66)));
  }
}
