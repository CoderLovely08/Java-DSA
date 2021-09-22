package com.datastructures;

import java.util.Scanner;

public class LastIndexOfElement {

  public static int find(int arr[], int n, int var) {
    if (n == -1) return -1;
    if (var == arr[n]) return n;
    return find(arr, n - 1, var);
  }

  public static void main(String[] args) {
    int arr[] = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      arr[i] = sc.nextInt();
    }
    int num = 4;
    System.out.print(find(arr, 5 - 1, num));
  }
}
