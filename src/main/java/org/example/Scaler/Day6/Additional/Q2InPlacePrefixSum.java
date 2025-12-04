package org.example.Scaler.Day6.Additional;

public class Q2InPlacePrefixSum {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        int[] result = solve(A);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solve(int[] A) {
        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pSum[i] = pSum[i - 1] + A[i];
        }
        return pSum;
    }
}
