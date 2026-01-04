package org.example.Scaler.Day11.Assignment;

public class Q3RowSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        int[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }

    }

    public static int[] solution(int[][] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = 0; j < A[0].length; j++) {
                sum += A[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}
