package Recursion;

public class SumOfNaturalNumbers {
    public static int sumOfNaturals(int n) {
        if (n == 1)
            return 1;
        return n + sumOfNaturals(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturals(9));
    }
}
