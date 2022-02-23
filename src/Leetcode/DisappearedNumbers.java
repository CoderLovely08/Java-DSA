package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i+1) {
                swap(nums, i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1) list.add(i+1);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(list);
        return list;
    }
    static void swap(int[] nums, int current) {
        while (nums[current] != current + 1) {
            int position = nums[current] - 1;
            if(nums[current]==nums[position]) break;
            int temp = nums[current];
            nums[current] = nums[position];
            nums[position] = temp;
        }
    }
    public static void main(String[] args) {
        findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
    }
}
