package Programs;

public class TowerOfHanoi {
    public static void TOH(int n, char source, char destination, char mid) {
        if (n>=1) {
            TOH(n-1, source, mid, destination);
            System.out.println(n+" from "+source+ " to "+destination);
            TOH(n-1, mid,destination, source);
        }
        System.out.println("done");
    }
    public static void main(String[] args) {
        int n=1;
        TOH(n, 'a', 'b', 'c');
    }
}