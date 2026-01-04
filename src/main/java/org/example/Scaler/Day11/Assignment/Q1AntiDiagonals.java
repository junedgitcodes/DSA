package org.example.Scaler.Day11.Assignment;

public class Q1AntiDiagonals {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }


    public static int[][] solve(int[][] A) {
        int n = A.length;
        int[][] result = new int[2 * n - 1][n];
        int[] index = new int[2*n-1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = i+j;
                result[d][index[d]] = A[i][j];
                index[d]++;
            }
        }
        return result;
    }
}
