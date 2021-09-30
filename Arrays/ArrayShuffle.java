package com.datastructures;

import java.util.Arrays;

public class ArrayShuffle {
  static int[] shuffle(int[] arr, int n) {
    int[] shuffle = new int[arr.length];
    for (int i = 0; i < n; i++) {
      shuffle[i * 2] = arr[i];
      shuffle[i * 2 + 1] = arr[n + i];
    }
    return shuffle;
  }

  public static void main(String[] args) {
    int[] arr = {7, 5, 9, 7, 5, 8, 10, 4, 3, 3, 2, 5, 9, 10};
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(shuffle(arr, 7)));
  }
}
