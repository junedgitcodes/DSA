package org.example.Scaler.Day11.Assignment;

public class Q2ColumnSum {

    public static void main(String[] args) {
        //[1,2,3,4]
        //[5,6,7,8]
        //[9,2,3,4]
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        int[] result = solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println("result[i] = " + result[i]);
        }
    }

    public static int[] solution(int[][] A) {
        int[] result = new int[A[0].length];
        int rows = A.length;
        int col = A[0].length;
        int idx = 0;
        for (int j = 0; j < col; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += A[i][j];
            }
            result[idx] = sum;
            idx++;
        }
        return result;
    }
}
