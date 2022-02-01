package Leetcode;

import java.util.Arrays;


public class PlusOne {
    //[1,2,3] => 1,2,4(123+1=124)
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]<9){
                digits[i]++;
                break;
            }else{
                digits[i]=0;
            }
        }
        if (digits[0]==0) {
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            return arr;
        }
        return digits;
    }
    public static void main(String[] args) {
        int[] num={9,9};
        System.out.println(Arrays.toString(plusOne(num)));
    }
}
