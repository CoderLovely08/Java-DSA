package Leetcode;

import java.util.Arrays;

public class DivideString {
    public static String[] divideString(String s , int k, char fill) {
        String[] result=new String[(int)Math.ceil((double)s.length()/k)];
        for (int i = 0; i < result.length; i++) {
            StringBuilder string = new StringBuilder();
            for (int j = i*k; j < i*k+k; j++) {
                try{
                    string.append(s.charAt(j));
                }catch(Exception e){
                    string.append(fill);
                }
            }
            result[i]=string.toString();
        }
        return result;
    }   
    
    public static void main(String[] args) {
        String s = "ctoyjrwtngqwt";
        int k = 8;
        char fill = 'n';
        System.out.println(Arrays.toString(divideString(s, k, fill)));
    }
}
