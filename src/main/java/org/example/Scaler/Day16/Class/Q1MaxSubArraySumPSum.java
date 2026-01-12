package org.example.Scaler.Day16.Class;

public class Q1MaxSubArraySumPSum {
    public static void main(String[] args) {
        int[] A = {-4, -3, -6, -9, -2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = Integer.MIN_VALUE;
        int[] pSum = pSum(A);
        for (int i = 0; i < A.length; i++) {
            int sum;
            for (int j = i; j < A.length; j++) {
                if (i == 0) {
                    sum = pSum[j];
                } else {
                    sum = pSum[j] - pSum[i-1];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

    public static int[] pSum(int[] A) {
        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pSum[i] = pSum[i - 1] + A[i];
        }
        return pSum;
    }
}
