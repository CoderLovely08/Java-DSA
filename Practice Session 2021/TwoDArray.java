package com.datastructures;

import java.util.Arrays;

public class TwoDArray {

  // maximum in a 2d array
  static int max(int arr[][]) {
    int max = Integer.MIN_VALUE;
    for (int[] row : arr) {
      for (int col : row) {
        if (max < col) {
          max = col;
        }
      }
    }
    return max;
  }
  // linear search in 2d array
  static int[] find(int arr[][], int target) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) if (arr[i][j] == target) return new int[] {i, j};
    }
    return new int[] {-1};
  }

  public static void main(String[] args) {
    int[][] arr = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    System.out.println(max(arr));
    System.out.print(Arrays.toString(find(arr, 7)));
  }
}
