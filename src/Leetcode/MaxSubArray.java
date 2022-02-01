package Leetcode;

public class MaxSubArray {
//[-2,2,5,-11,6]
    public static int maxSubArray(int[] nums) {
        int ans=nums[0];
        int a=ans;
        for (int i =1; i< nums.length; i++) {
            a=Math.max(a+nums[i],nums[i]);
            ans=Math.max(ans, a);
            System.out.println(ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Ans: "+maxSubArray(new int[] {-2,2,5,-11,6}));
    }
}
