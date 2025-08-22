package org.example.Scaler.Day13;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] solution(int[][] A) {
        int[][] result = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                int temp = A[i][j];
                result[j][i] = temp;
            }
        }
        return result;
    }

}
