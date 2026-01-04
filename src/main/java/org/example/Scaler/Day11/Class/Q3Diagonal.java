package org.example.Scaler.Day11.Class;

public class Q3Diagonal {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printDiagonal(A);
    }

    public static void printDiagonal(int[][] A) {
        int rows = A.length;
        int col = A[0].length;
        int[] d1 = principalDiagonal(A);
        for (int val : d1) {
            System.out.print(val + " ");
        }
        System.out.println();
        int[] d2 = antiPrincipalDiagonal(A);
        for (int val : d2) {
            System.out.print(val+" ");
        }
    }

    public static int[] principalDiagonal(int[][] A) {
        int[] result = new int[A.length];
        int i = 0;
        int j = 0;
        int index = 0;
        for (int k = 0; k < A.length; k++) {
            result[index] = A[i][j];
            i++;
            j++;
            index++;
        }
        return result;
    }

    public static int[] antiPrincipalDiagonal(int[][] A) {
        int[] result = new int[A.length];
        int i = 0;
        int j = A[0].length-1;
        int index = 0;
        for (int k = 0; k < A.length; k++) {
            result[index] = A[i][j];
            i++;
            j--;
            index++;
        }
        return result;
    }
}
