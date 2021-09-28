package com.datastructures;

import java.util.Arrays;

public class RemoveDuplicate {

  static int removeDuplicate(int[] arr) {
    int count = -1;
    for (int i = 0; i < arr.length; i++) {
      int ans = binarySearch(arr, arr[i]);
      if (ans == i) {
        count++;
        arr[count] = arr[ans];
      } else {
        continue;
      }
    }
    return count + 1;
  }

  static int binarySearch(int[] arr, int target) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {1, 1, 2};
    System.out.println(removeDuplicate(arr));
    System.out.print(Arrays.toString(arr));
  }
}
