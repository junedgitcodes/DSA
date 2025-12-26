package org.example.Scaler.Aug08LabSessionOn2DMatrix;

public class Q3Diagonal {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(principalDiagonal(mat));
        System.out.println(principalAntiDiagonal(mat));
    }

    public static int principalDiagonal(int[][] A) {
        int sum = 0;
        int row = 0;
        int col = 0;
        int n = A.length;
        while (row < n) {
            sum = sum + A[row][col];
            row++;
            col++;
        }
        return sum;
    }

    public static int principalAntiDiagonal(int[][] A) {
        int sum = 0;
        int n = A.length;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i][n - 1 - i];
        }
        return sum;
    }
}
