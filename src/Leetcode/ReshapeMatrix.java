package Leetcode;

public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] result = new int[r][c];
        int row = 0;
        for (int[] i : mat) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(mat[row][j] + " ");
            }
            row++;
            System.out.println();
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 6 }
        };
        matrixReshape(arr, 2, 2);
    }
}
