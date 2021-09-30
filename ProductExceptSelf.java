package com.datastructures.Sorting;

import java.util.Arrays;

public class ProductExceptSelf {


static int[] productExceptSelf(int[] arr) {
    int[] ans = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      ans[i] = findProduct(arr,i);
    }
    return ans;
  }
  
  static int findProduct(int[] arr,int index){
    int ans = 1;
    for(int i = 0; i < arr.length; i++){
      if(i == index)
      continue;
      else{
      ans *= arr[i];
      }
    }return ans;
  }
  
    public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println(Arrays.toString(productExceptSelf(arr2)));
  }
}
