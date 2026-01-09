package org.example.Scaler.Day13.Class;

import java.util.stream.Collectors;

public class Q2Rotate90 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = solve(A);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[][] A) {
        int n = A.length;
        int[][] transpose = transpose(A);
        for (int i = 0; i < n; i++) {
            reverse(transpose[i]);
        }
        return transpose;
    }


    public static int[][] transpose(int[][] A) {
        int n = A.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }

    public static int[] reverse(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while (i <= j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }
}
