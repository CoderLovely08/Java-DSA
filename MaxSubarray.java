package com.datastructures;

public class MaxSubarray {
    
    static int findMaxSum(int arr[]){
      int max=Integer.MIN_VALUE,sum=0;
      for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(max<sum){
          max=sum; 
        }if(sum<0){
          sum=0;
        }
      }
      return max;
    }

  public static void main(String[] args) {
    int[] arr={-1,-1,-1,-1,-1};
    System.out.print(findMaxSum(arr));
  }

}
