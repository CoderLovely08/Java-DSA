package Leetcode;

import java.util.Arrays;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length) {
            int correct = nums[i]-1;
            if(nums[i]!=correct){
                swap(nums,i,correct);
            }else i++;
        }
        System.out.println(Arrays.toString(nums));
        return 1;
    }
    static void swap(int[] nums, int current, int correct){
        int temp = nums[current];
        nums[current]=nums[correct];
        nums[correct]=temp;
        System.out.println("hi");
    }

    // another naive approach

    public int findDuplicate1(int[] nums) {
        int ans=0;
          for (int i = 0; i < nums.length; i++) {
              if (nums[i]!=i+1) {
                  ans=swap(nums, i);
              }
          }
          System.out.println(Arrays.toString(nums));
          return ans;
      }
      static int swap(int[] nums, int current) {
          while (nums[current] != current + 1) {
              int position = nums[current] - 1;
              if(nums[current]==nums[position]) return nums[current];
              int temp = nums[current];
              nums[current] = nums[position];
              nums[position] = temp;
          }
          return 0;
      }    
      
    public static void main(String[] args) {
        findDuplicate(new int[] {6,5,7,4,3,2,1});
    }
}
