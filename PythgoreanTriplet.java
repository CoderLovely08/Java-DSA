package com.datastructures;

import java.util.Scanner;

public class PythgoreanTriplet {
  static boolean isTriplet(int arr[]) {
    if (arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = new int[3];
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      arr[i] = input.nextInt();
    }
    System.out.print(isTriplet(arr));
  }
}
