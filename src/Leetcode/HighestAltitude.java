package Leetcode;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int ans=0,ans1=0;
        for (int i : gain) {
            ans+=i;
            System.out.println(ans);
            ans1=Math.max(ans,ans1);
        }
        return ans1;
    }
    public static void main(String[] args) {
        int[] gain = {52,-91,72};
        System.out.println(largestAltitude(gain));
    }    
}
