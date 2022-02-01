package Leetcode;

import java.util.Arrays;

public class RotateByK {
    public static void rotate(int[] nums, int k) {
        int[] result= new int[nums.length];
        int i=nums.length-1,n=k;
        while (k>0) {
            k--;
            result[k]=nums[i];
            i--;
        }
        i=0;
        for (int j = n; j < result.length; j++,i++) {
            result[j]=nums[i];
        }
        nums=result;
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
