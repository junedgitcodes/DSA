package org.example.Scaler.Day18.Class;

public class Q3SpiralOrderMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        spiralOrderMatrix(A);
    }

    public static void spiralOrderMatrix(int[][] A) {
        int n = A.length;
        int r = 0;
        int c = 0;
        int loop = n - 1;
        while (loop > 0) {
            int i = r;
            int j = c;
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j]+" ");
                j++;
            }
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j]+" ");
                i++;
            }
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j]+" ");
                j--;
            }
            for (int k = 0; k < loop; k++) {
                System.out.print(A[i][j]+" ");
                i--;
            }
            r++;
            c++;
            loop = loop - 2;
        }
        if (loop == 0) {
            System.out.print(A[r][c]);
        }
    }
}
