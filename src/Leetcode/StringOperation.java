package Leetcode;

public class StringOperation {
    public static int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (String string : operations) {
            switch (string) {
                case "++X":
                case "X++": x+=1;
                    break;
                case "--X":
                case "X--": x-=1;
                    break;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        String[] operations ={"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
