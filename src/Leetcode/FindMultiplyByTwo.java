package Leetcode;

import java.util.HashSet;

public class FindMultiplyByTwo {
    public static int findFinalValue(int[] nums, int original) {
        int i =0;
        while (i<nums.length) {
            if (nums[i]==original){
                original=original*2;
                i=0;
            }else{
                i++;
            }
        }
        return original;
    }
    //approach 2
    public int findFinalValue2(int[] nums, int original)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
            if(i >= original)
                set.add(i);
        while(true)
            if(set.contains(original))
                original *= 2;
            else
                break;
        return original;
    }
    public static void main(String[] args) {
        int[] nums ={8,19,4,2,15,3};
        System.out.println(findFinalValue(nums, 2));
    }
}
