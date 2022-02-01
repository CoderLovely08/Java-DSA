package Leetcode;

public class StringLoweCase {
    public static String toLowerCase(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <'B') {
                int cur = c[i];
                c[i]=(char) (cur+32);
            }
        }
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        System.out.println(toLowerCase("Helo@{}"));
    }
}
