package Leetcode;

import java.util.Arrays;

public class StringReverse {
    public static void reverseString(char[] s) {
        for (int i = 0; i <= s.length/2; i++) {
              char c = s[i];
              s[i] = s[s.length-1-i];
              s[s.length-1-i] = c;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        reverseString(new char[] {'h','e','l','l','o','j'});
    }
}
