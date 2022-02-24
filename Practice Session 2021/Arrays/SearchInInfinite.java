package com.datastructures.Arrays;

public class SearchInInfinite {

  static int search(int[] arr, int target) {
    int start = 0, end = 1;
    int ans = binarySearch(arr, start, end, target);
    while (ans == -1 && target > arr[end]) {
      int temp = end + 1;
      end = end + (end - start + 1) * 2;
      start = temp;
      ans = binarySearch(arr, start, end, target);
    }
    System.out.println(start + " " + end);
    return arr[ans];
  }

  static int binarySearch(int[] arr, int s, int e, int target) {
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (arr[mid] < target) {
        s = mid + 1;
      } else if (target < arr[mid]) {
        e = mid - 1;
      } else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 6, 7, 89, 123, 213, 346, 568, 694};
    System.out.print(search(arr, 213));
  }
}
