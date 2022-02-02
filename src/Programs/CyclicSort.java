package Programs;

import java.util.Arrays;

public class CyclicSort {
    // 6,4,2,3,1,5,7
    // 0 1 2 3 4 5 6
    public static void cyclicSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                swap(nums, i);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int current) {
        while (nums[current] != current + 1) {
            int position = nums[current] - 1;
            int temp = nums[current];
            nums[current] = nums[position];
            nums[position] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 3, 1, 5 };
        cyclicSort(nums);
    }
}
