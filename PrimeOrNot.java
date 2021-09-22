package com.datastructures;

import java.util.Scanner;

public class PrimeOrNot {

  static boolean isPrime(int num) {
    if (num == 1) return true;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    System.out.print(isPrime(num));
  }
}
