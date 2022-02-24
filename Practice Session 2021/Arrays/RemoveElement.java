package com.datastructures.Arrays;

public class RemoveElement {

  static int removeElement(int[] arr, int target) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (target != arr[i]) {
        arr[count] = arr[i];
        count++;
      } 
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 56, 78, 3};
//    System.out.print(removeElement(arr, 3));
    int ans=removeElement(arr,3);
    for(int i:arr){
      System.out.println(i);
    }
  }
}
