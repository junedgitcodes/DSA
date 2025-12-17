package org.example.Scaler.Day7.Class;

public class Q2RangeQueryEvenValue {
    public static void main(String[] args) {
        int[] A = {-5, 10, 20, 40, 35, -2, -10};//0,10,30,70,70,68,58
        int[][] B = {{0, 4}, {1, 2}, {2, 5}, {3, 3}};
        int[] result = solve(A, B);
        for (int k : result) {
            System.out.println(k);
        }
    }

    public static int[] solve(int[] A, int[][] B) {
        int[] result = new int[B.length];
        int sum = 0;
        int[] pSum = pSumEvenValue(A);
        for (int i = 0; i < B.length; i++) {
            int s = B[i][0];
            int e = B[i][1];
            if (s == 0) {
                sum = pSum[e];
            } else {
                sum = pSum[e] - pSum[s-1];
            }
            result[i] = sum;
        }
        return result;
    }

    public static int[] pSumEvenValue(int[] A) {
        int[] pSum = new int[A.length];
        if (A[0] % 2 == 0) {
            pSum[0] = A[0];
        } else {
            pSum[0] = 0;
        }
        for (int i = 1; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                pSum[i] = pSum[i - 1] + A[i];
            } else {
                pSum[i] = pSum[i - 1];
            }
        }
        return pSum;
    }
}
