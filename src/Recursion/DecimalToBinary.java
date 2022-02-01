package Recursion;

public class DecimalToBinary {
    public static String decToBin(int n, String result) {
        if (n == 0)
            return result;
        result = n % 2 + result;
        return decToBin(n / 2, result);
    }

    public static void main(String[] args) {
        System.out.println(decToBin(10, ""));
    }
}
