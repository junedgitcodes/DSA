package org.example.Scaler.Day11.Class;

public class Q1RowSum {

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rowSum(A);
    }

    public static void rowSum(int[][] A) {
        int rows = A.length;
        int column = A[0].length;
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < column; j++) {
                sum += A[i][j];
            }
            System.out.println(sum);
        }
    }
}
