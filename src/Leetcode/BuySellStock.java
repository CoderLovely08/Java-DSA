package Leetcode;

public class BuySellStock {
    public static int maxProfit(int[] prices){
        int profit=0,buyPrice=Integer.MAX_VALUE;
        for (int i : prices) {
            if (i<buyPrice) {
                buyPrice=i;
            } else if(Math.max(i-buyPrice, profit)>profit) {
                profit=Math.max(i-buyPrice, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7,6,4,3,1}));
    }
}
