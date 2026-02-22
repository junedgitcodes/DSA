package org.example.Scaler.Day18.Class;

public class Q2MatrixBoundary {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        printBoundary(A);
    }

    public static void printBoundary(int[][] A) {
        int n = A.length;
        int i = 0;
        int j = 0;
        int loop = n - 1;
        while (loop > 0) {
            for (int k = 0; k < n - 1; k++) {
                System.out.print(A[i][j] + " ");
                j++;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.print(A[i][j] + " ");
                i++;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.print(A[i][j] + " ");
                j--;
            }
            for (int k = 0; k < n - 1; k++) {
                System.out.print(A[i][j] + " ");
                i--;
            }
        }
    }
}
