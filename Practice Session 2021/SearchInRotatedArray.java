package com.datastructures;

public class SearchInRotatedArray {

  static int search(int[] arr, int target) {
    boolean asc = true;
    int pivot = findMax(arr);
    if (arr[pivot] > arr[arr.length - 1] && arr.length == 2) {
      asc = false;
    }
    int ans = binarySearch(arr, 0, pivot, target, asc);
    if (ans == -1) {
      return binarySearch(arr, pivot + 1, arr.length - 1, target, asc);
    }
    return ans;
  }

  // to find highest or pivot in rotated sorted array
  // not so optimised
  static int findMax(int[] arr) {
    int start = 0, end = arr.length - 1, mid = 0;
    while (start <= end) {
      mid = start + (end - start) / 2;
      if (mid + 1 == arr.length) {
        return mid;
      }
      if (arr[mid] > arr[mid + 1]) {
        return mid;
      }
      if (arr[mid] < arr[start]) {
        end = mid - 1;
      } else if (arr[mid] < arr[mid + 1]) {
        start = mid + 1;
      }
    }
    return arr[start];
  }

  // binary search
  static int binarySearch(int[] arr, int start, int end, int target, boolean asc) {
    //    int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (asc) {
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

  static int search2(int[] nums, int target) {

    int lo = 0;
    int hi = nums.length - 1;

    while (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (nums[mid] == target) return mid;

      if (nums[lo] <= nums[mid]) {
        if (target >= nums[lo] && target <= nums[mid]) {
          hi = mid - 1;
        } else {
          lo = mid + 1;
        }
      } else {
        if (target >= nums[mid] && target <= nums[hi]) {
          lo = mid + 1;
        } else {
          hi = mid - 1;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {3, 5, 1};
    //    System.out.println(findMax(arr));
    // System.out.println(findMax2(arr));
    System.out.println(search2(arr, 1));
  }
}
