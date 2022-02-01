package Recursion;

public class BinarySearch {
    public static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if (target == nums[mid])
            return mid;
        if (nums[mid] > target)
            return binarySearch(nums, target, start, mid - 1);
        else
            return binarySearch(nums, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 8 };
        int target = 5, start = 0, end = nums.length - 1;
        System.out.println(binarySearch(nums, target, start, end));
    }
}
