package Recursion;

public class ReverseString {
    public static String reverseString(String s) {
        if (s.length() == 0)
            return "";
        String ans = reverseString(s.substring(1)) + s.charAt(0);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("lauda"));
    }
}
