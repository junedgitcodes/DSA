package org.example.Scaler.Day8.Assignments;

public class Q2MaximumSubArrayEasy {
    public static void main(String[] args) {
        int A = 5;
        int B = 12;
        int[] C = {2, 1, 3, 4, 5};
        System.out.println(maxSumArray(A, B, C));
    }

    public static int maxSumArray(int A, int B, int[] C) {
        int sum = 0;
        int maxSum = 0;
        int left = 0;

        for (int i = 0; i < A; i++) {
            sum += C[i];

            while (sum > B && left <= i) {
                sum = sum - C[left];
                left++;
            }
            if (sum <= B) {
                maxSum = Math.max(sum, maxSum);
            }

        }
        return maxSum;
    }
}
