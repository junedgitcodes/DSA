package org.example.Scaler.Day16.Class;

public class Q1MaxSubArraySumBruteForce {
    public static void main(String[] args) {
        int[] A = {-4, -3, -6, -9, -2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += A[k];
                }
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
