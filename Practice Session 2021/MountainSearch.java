package com.datastructures;

public class MountainSearch {

  /*
  approach consists of two things first find the peak element
  and then look for both the sides of it and finally
  return the one with lower index in case of two answers
  */

  static int searchMountain(int[] arr, int target) {
    int peak = peak(arr);
    int ans = binarySearch(arr, 0, peak, target, true);
    if (ans > -1) {
      return ans;
    }
    return binarySearch(arr, peak, arr.length - 1, target, false);
  }

  // finding the peak elements index
  static int peak(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }
    return start;
  }

  // searching on either side of the peak
  static int binarySearch(int[] arr, int s, int e, int target, boolean isAscending) {
    while (s <= e) {
      int mid = s + (e - s) / 2;
      if (isAscending) {
        if (target < arr[mid]) {
          e = mid - 1;
        } else if (target > arr[mid]) {
          s = mid + 1;
        } else {
          return mid;
        }
      } else {
        if (target > arr[mid]) {
          e = mid - 1;
        } else if (target < arr[mid]) {
          s = mid + 1;
        } else {
          return mid;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {2, 14, 9, 8, 7, 5, 3, 1};
    System.out.println(searchMountain(arr, 9));
  }
}
