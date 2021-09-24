package com.datastructures;

public class BinarySearch {

  static int search(int[] arr, int target) {
    int start = 0, end = arr.length - 1;
    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (target < arr[mid]) {
        end = mid - 1;
      } else if (target > arr[mid]) {
        start = mid + 1;
      }
      else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {12, 18, 24, 30, 36, 42};
    System.out.print(search(arr, 12));
  }
}
