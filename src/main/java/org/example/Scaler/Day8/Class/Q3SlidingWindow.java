package org.example.Scaler.Day8.Class;

public class Q3SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};//5-3
        int k = 3;
        System.out.println(maxSum(arr, k));
    }

    public static int maxSum(int[] A, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += A[i];
        }
        int ans = sum;
        for (int i = k; i < A.length; i++) {
            sum = sum + A[i] - A[i - k];
            ans = Math.max(sum, ans);
        }
        return ans;
    }
}
