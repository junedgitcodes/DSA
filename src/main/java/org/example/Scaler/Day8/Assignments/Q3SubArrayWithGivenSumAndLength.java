package org.example.Scaler.Day8.Assignments;

public class Q3SubArrayWithGivenSumAndLength {
    public static void main(String[] args) {
        int[] A = {4, 3, 1, 6, 1};
        int B = 3;
        int C = 11;
        System.out.println(solve(A, B, C));
    }

    public static int solve(int[] A, int B, int C) {

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        if (sum == C) {
            return 1;
        }
        int totalSum = sum;
        for (int i = B; i < A.length; i++) {
            sum = sum + A[i] - A[i - B];
            if (sum == C) {
                return 1;
            }
        }
        return 0;
    }
}
