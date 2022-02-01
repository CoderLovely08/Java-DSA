package Leetcode;

public class JewelsAndStones {
    public static int reverse(int x) {
        long rev = 0;
		while(x != 0){
			rev = rev*10 + x%10;
			x /= 10;
		}
        return (rev<=Integer.MAX_VALUE && rev>= Integer.MIN_VALUE)?(int)rev:0;
 
    }
    public static void main(String[] args) {
        System.out.println(reverse(-239563697));
    }
}
