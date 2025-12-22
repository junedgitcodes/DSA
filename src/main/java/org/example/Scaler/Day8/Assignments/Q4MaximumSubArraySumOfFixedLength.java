package org.example.Scaler.Day8.Assignments;

public class Q4MaximumSubArraySumOfFixedLength {
    public static void main(String[] args) {
        int[] A = {6, 7, 8, 2};
        int B = 2;
        System.out.println(solve(A, B));
    }

    public static long solve(int[] A, int B) {
        long sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }
        long maxSum = sum;
        for (int i = B; i < A.length; i++) {
            sum = (long) sum + A[i] - A[i - B];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
