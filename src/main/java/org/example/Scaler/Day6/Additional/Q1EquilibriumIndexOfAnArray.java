package org.example.Scaler.Day6.Additional;

public class Q1EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int totalSum = 0;
        for (int i : A) {
            totalSum += i;
        }
        int leftSum = 0;
        for (int i = 0; i < A.length; i++) {
            int rightSum = totalSum - leftSum - A[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += A[i];
        }
        return -1;
    }
}
