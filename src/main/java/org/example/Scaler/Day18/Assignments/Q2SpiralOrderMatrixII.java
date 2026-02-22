package org.example.Scaler.Day18.Assignments;

public class Q2SpiralOrderMatrixII {
    public static void main(String[] args) {
        int size = 5;
        int[][] A = generateMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int A) {
        int r = 0;
        int c = 0;
        int loop = A - 1;
        int inc = 1;
        int[][] result = new int[A][A];
        while (loop > 0) {
            int i = r;
            int j = c;

            for (int k = 0; k < loop; k++) {
                result[i][j] = inc;
                inc++;
                j++;
            }
            for (int k = 0; k < loop; k++) {
                result[i][j] = inc;
                inc++;
                i++;
            }
            for (int k = 0; k < loop; k++) {
                result[i][j] = inc;
                inc++;
                j--;
            }
            for (int k = 0; k < loop; k++) {
                result[i][j] = inc;
                inc++;
                i--;
            }
            r++;
            c++;
            loop = loop - 2;
        }
        if (loop == 0) {
            result[r][c] = inc;
        }
        return result;
    }
}
