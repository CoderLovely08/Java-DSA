package Leetcode;

public class MissingNumber {

    //  3 , 0 , 1
    //  0   1   2

    public static int missingNumber(int[] nums) {
        int ans=nums.length*(nums.length+1)/2;
        for (int i : nums) {
            ans-=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 1,0 };
        System.out.println(missingNumber(nums));
    }
}
