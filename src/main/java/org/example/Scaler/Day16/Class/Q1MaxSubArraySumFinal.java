package org.example.Scaler.Day16.Class;

public class Q1MaxSubArraySumFinal {
    public static void main(String[] args) {
        int[] A = {-4, -3, -6, -9, -2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int el : A) {
            sum += el;
            ans = Math.max(ans, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
