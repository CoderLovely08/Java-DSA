package com.datastructures;

import java.util.Arrays;


public class ArrayShuffle {
  static int[] shuffle(int[] arr){
      int mid1=(arr.length-1)/2;
      int mid2=mid1+1;    
    for(int i=(arr.length-1)/2;i>0;i--){
    mid1=i;
    mid2=;
      System.out.println("mid and mid-1 for left swap is "+mid1+" "+(mid1+1));
      swap(arr,mid1,mid1+1);
      if(i==(arr.length-1)/2){
        continue;
      }else{
        System.out.println("mid and mid-1 fro right swap is "+(mid2)+" "+(arr.length-i-1));
        swap(arr,mid2,arr.length-1-i);
      }
      System.out.println("after an iteration"+Arrays.toString(arr));
    }return arr;
  }
  
  static int[] swap(int[] arr, int x, int y){
    System.out.println("Before swap: "+arr[x]+" "+arr[y]);
    int temp=arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
    System.out.println("After swap: "+arr[x]+" "+arr[y]);
    return new int[] {arr[x], arr[y]};
  }
  public static void main(String[] args) {
    int[] arr={1,2,3,4,4,3,2,1};
    System.out.println(Arrays.toString(shuffle(arr)));
  }
}
