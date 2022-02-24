package com.datastructures;

import java.util.Arrays;
import java.util.Scanner;


public class RunningSum {
    
    static int[] sumArray(int arr[]){
      int sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        arr[i]=sum; 
      }
      return arr;
    }

  public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6};
      System.out.println("Original Array: "+Arrays.toString(arr));
      System.out.print("Running Sum: "+Arrays.toString(sumArray(arr)));
  }

}
