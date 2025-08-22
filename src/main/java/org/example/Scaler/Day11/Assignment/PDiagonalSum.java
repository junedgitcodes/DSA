package org.example.Scaler.Day11.Assignment;

public class PDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {5, 6, 7}, {9, 2, 3}};
        int result = solution(arr);
        System.out.println("result = " + result);
    }

    public static int solution(int[][] A) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < A.length) {
            sum += A[i][j];
            i++;
            j++;
        }
        return sum;
    }
}
