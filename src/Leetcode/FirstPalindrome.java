package Leetcode;

public class FirstPalindrome {
    public static String firstPalindrome(String[] words) {
        for (String string : words) {
            if(isPalindrome(string)) return string;
        }
        return "";
    }
    static boolean isPalindrome(String s) {
        if (s.length()==1) return true;
        boolean flag = false;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i-1))
                flag = true;
            else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}
