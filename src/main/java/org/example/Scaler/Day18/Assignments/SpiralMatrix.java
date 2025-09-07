package org.example.Scaler.Day18.Assignments;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] A = solution(5);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solution(int n) {
        int[][] A = new int[n][n];
        int r = 0;
        int c = 0;
        int loop = n - 1;
        int inc = 1;
        while (loop > 0) {
            int i = r;
            int j = c;
            for (int k = 0; k < loop; k++) {
                A[i][j] = inc;
                inc++;
                j++;
            }
            for (int k = 0; k < loop; k++) {
                A[i][j] = inc;
                inc++;
                i++;
            }
            for (int k = 0; k < loop; k++) {
                A[i][j] = inc;
                inc++;
                j--;
            }
            for (int k = 0; k < loop; k++) {
                A[i][j] = inc;
                inc++;
                i--;
            }
            r++;
            c++;
            loop -= 2;
        }
        if (loop == 0) {
            A[r][c] = inc;
        }
        return A;
    }
}
