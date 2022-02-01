package Leetcode;

import java.util.Arrays;

/**
 * ArrayConcatenation
 */
public class ArrayConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}