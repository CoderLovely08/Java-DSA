package Leetcode;

public class MaxWordsSentence {
    public static int mostWordsFound(String[] sentences) {
        int max = 1,prev;
        for (String string : sentences) {
            prev=max;
            max=1;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ') {
                    //System.out.println(max);
                    max++;
                }
                System.out.print(string.charAt(i)+" ");
            }
            max=Math.max(max, prev);
            System.out.println(max);
        }
        return max;
    }

    public static void main(String[] args) {
        String sentences[] ={"please wait", "continue h to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }
}
