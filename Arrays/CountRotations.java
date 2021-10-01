package com.datastructures.Arrays;

public class CountRotations {

  static int countRotation(int[] arr) {
    int start = 0, end = arr.length - 1;
    if (arr[start] < arr[end]) {
      return 0;
    }
    while (start <= end) {
      int mid = start + (end - start) / 2;
      int next = (mid + 1) % arr.length, prev = (mid + arr.length - 1) % arr.length;
      //   System.out.print(next+" "+prev);
      if (arr[mid] < arr[next] && arr[mid] < arr[prev]) {
        return mid;
      } else if (arr[mid] < arr[start]) {
        end = mid - 1;
      } else if (arr[mid] < arr[end]) {
        start = mid + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {11, 12, 13, 4, 5, 6, 7};
    System.out.print(countRotation(arr));
  }
}
