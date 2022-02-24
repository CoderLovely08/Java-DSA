package com.datastructures;

public class PalindromeNumber {

  static boolean isPalindrome(int x){
    if (x < 0){
      return false;
    }
    int temp = x,rev = 0;
    while (x > 0){
      int mod = x % 10;
      rev = rev * 10 + mod;
      x /= 10;
    }
      return temp == rev;
    }
  
  public static void main(String[] args) {
    System.out.print(isPalindrome(121));
  }

}
