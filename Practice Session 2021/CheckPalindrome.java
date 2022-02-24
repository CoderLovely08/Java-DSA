package com.datastructures;

public class CheckPalindrome {

    static boolean isPalindrome(int num){
      int original=num,rev=0;
      while(num>0){
        int mod=num%10;
        rev=rev*10+mod;
        num/=10;
      }
      return original==rev?true:false;      
    }

  public static void main(String[] args) {
  
      System.out.println(isPalindrome(121));
      System.out.println(isPalindrome(12101));
      System.out.println(isPalindrome(1001));
  }
}
