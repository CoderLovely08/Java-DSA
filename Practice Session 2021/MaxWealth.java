package com.datastructures;

public class MaxWealth {

  static int findMaxWealth(int[][] arr){
    int max=0;
    for(int[] row:arr){
      int sum=0;
      for(int col:row){
        sum+=col;
      }
      if(max<sum)
      max=sum;
    }
    return max; 
  }
  
  public static void main(String[] args){
    int[][] arr={
      {5,2,3},
      {1,2,3},
      {2,3,4}
    };
    System.out.print(findMaxWealth(arr));
  }
}
