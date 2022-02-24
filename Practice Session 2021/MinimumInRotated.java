package com.datastructures;

public class MinimumInRotated {

  static int findMin(int[] arr) {
    int start = 0, end = arr.length - 1, mid = 0;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (mid + 1 == arr.length) {
        return arr[0];
      }
      if (arr[mid] < arr[start]) {
        end = mid - 1;
      } else if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else if (arr[mid] > arr[mid + 1]) {
        return arr[mid + 1];
      }
    }
    return arr[0];
  }

  public static void main(String[] args) {
    int[] arr={15,16,17,12,13,14};
    System.out.print(findMin(arr));
  }

}
