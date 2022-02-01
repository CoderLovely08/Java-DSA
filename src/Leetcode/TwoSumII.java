package Leetcode;

import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int complement;
        for (int i = 0; i < numbers.length; i++) {
            complement = target - numbers[i];
            int resultVar = search(numbers, complement, i + 1);
            if (resultVar != -1) {
                result[0] = i+1;
                result[1] = resultVar+1;
                break;
            }
        }
        return result;
    }

    public static int search(int[] nums, int target, int start) {
        int end = nums.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
