package com.datastructures;

public class SumOfNum {
    //approach one with O(1)
  static int sum(int n) {
    return n * (n + 1) / 2;
  }
    //approach 2 with O(n)
  static int sum2(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i ++){
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(sum(5));
    System.out.println(sum2(5));
  }
}
