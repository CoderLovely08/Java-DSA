package com.datastructures;

public class PeakInMountain {

  static int findPeak(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return arr[start];
  }

  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 7, 5, 3, 1};
    System.out.println(findPeak(arr));
  }
}
