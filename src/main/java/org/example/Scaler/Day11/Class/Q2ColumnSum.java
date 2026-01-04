package org.example.Scaler.Day11.Class;

public class Q2ColumnSum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        columnSum(A);
    }

    public static void columnSum(int[][] A) {
        int rows = A.length;
        int col = A[0].length;

        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += A[i][j];
            }
            System.out.println(sum);
        }
    }
}
