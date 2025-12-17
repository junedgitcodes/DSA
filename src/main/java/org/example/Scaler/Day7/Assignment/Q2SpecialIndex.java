package org.example.Scaler.Day7.Assignment;

public class Q2SpecialIndex {
    public static void main(String[] args) {
        int[] A = {2, 1, 6, 4};//2,2,8,8      0,1,1,5
        System.out.println(solve(A)); // i =1

    }

    public static int solve(int[] A) {
        int ans = 0;
        int n = A.length;
        int[] evenPSum = evenPSum(A);
        int[] oddPSum = oddPSum(A);
        int evenSum = 0, oddSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                evenSum = oddPSum[n - 1] - oddPSum[i];
                oddSum = evenPSum[n - 1] - evenPSum[i];
            } else {
                evenSum = evenPSum[i - 1] + oddPSum[n - 1] - oddPSum[i];
                oddSum = oddPSum[i - 1] + evenPSum[n - 1] - evenPSum[i];
            }
            if (evenSum == oddSum) {
                ans++;
            }
        }
        return ans;
    }

    public static int[] evenPSum(int[] A) {
        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                pSum[i] = pSum[i - 1] + A[i];
            } else {
                pSum[i] = pSum[i - 1];
            }
        }
        return pSum;
    }

    public static int[] oddPSum(int[] A) {
        int[] pSum = new int[A.length];
        pSum[0] = 0;
        for (int i = 1; i < A.length; i++) {
            if (i % 2 != 0) {
                pSum[i] = pSum[i - 1] + A[i];
            } else {
                pSum[i] = pSum[i - 1];
            }
        }
        return pSum;
    }
}
