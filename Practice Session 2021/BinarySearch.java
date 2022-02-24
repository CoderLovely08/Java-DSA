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
      } else {
        return mid;
      }
    }
    return -1;
  }

  // agnostic binary search
  static int agnosticBinarySearch(int[] arr, int target) {
    boolean isAscending = true;
    if (arr[0] > arr[arr.length - 1]) isAscending = false;
    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (isAscending) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else if (target > arr[mid]) {
          start = mid + 1;
        } else {
          return mid;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else if (target < arr[mid]) {
          start = mid + 1;
        } else {
          return mid;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {12, 18, 24, 30, 36, 42};
    int[] arr1 = {18, 16, 15, 14, 8, 7, 5, 4, 3, 1};
    System.out.println(agnosticBinarySearch(arr, 12));
    System.out.print(agnosticBinarySearch(arr1, 3));
  }
}
