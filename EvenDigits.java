package com.datastructures;

public class EvenDigits {
    
    //approach 1
  static int findEvenDigits(int arr[]) {
    int count = 0;
    for (int num : arr) {
      String ans = Integer.toString(num);
      if (ans.length() % 2 == 0) count++;
    }
    return count;
  }
  //approach 2
  static int findEvenDigits2(int arr[]){
    int ans = 0;
    for (int num : arr){
      int count = 0;
      while(num > 0){
        count++;
        num /= 10;
      }
      if(count % 2 == 0){
        ans++;
      }
    }
    return ans;
  }

    //approach 3
    static int findEvenDigits3(int arr[]){
      int count=0; 
      int ans=0;
      for(double n:arr){ 
        count=(int)(Math.log10(n)+1);
        if(count%2==0)
        ans++;
      }
    return ans;
  } 
    
  public static void main(String[] args) {
    int[] arr = {121, 134, 345, 5643, 789};
    System.out.println(findEvenDigits(arr));
    System.out.println(findEvenDigits2(arr));
    System.out.print(findEvenDigits3(arr));
  }
}
