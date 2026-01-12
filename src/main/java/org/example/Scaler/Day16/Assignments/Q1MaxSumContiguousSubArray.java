package org.example.Scaler.Day16.Assignments;

public class Q1MaxSumContiguousSubArray {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, -10};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int el : A) {
            sum += el;
            ans = Math.max(sum, ans);
            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
