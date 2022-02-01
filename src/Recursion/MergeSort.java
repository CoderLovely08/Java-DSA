package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] nums, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            mergeArray(nums, start, mid, end);
        }
    }

    public static void mergeArray(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= end) {
            temp[k++] = nums[j++];
        }
        for (i = start; i <= end; i++) {
            nums[i] = temp[i - start];
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 2, 3, 6, 5, 8, 9 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}
