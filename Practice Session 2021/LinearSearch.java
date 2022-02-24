package com.datastructures;

public class LinearSearch {

  // approach returning element
  static int findElement(int arr[], int target) {
    for (int element : arr) {
      if (element == target) return element;
    }
    return -1;
  }

  // approach returning index
  static int findElement2(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) return i;
    }
    return -1;
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6};
    int target = 3;
    System.out.println(findElement(arr, target));
    System.out.print(findElement2(arr, target));
  }
}
