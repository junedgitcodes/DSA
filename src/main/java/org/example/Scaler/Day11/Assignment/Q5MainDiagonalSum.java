package org.example.Scaler.Day11.Assignment;

public class Q5MainDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {5, 6, 7}, {9, 2, 3}};
        int result = solution(arr);
        System.out.println("result = " + result);
    }

    public static int solution(int[][] A) {
        int k = 0;
        int j = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[k][j];
            k++;
            j++;
        }
        return sum;
    }
}
