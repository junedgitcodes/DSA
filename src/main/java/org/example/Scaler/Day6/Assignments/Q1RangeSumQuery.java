package org.example.Scaler.Day6.Assignments;

public class Q1RangeSumQuery {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};//(1,3,6,10,15)
        int[][] B = {{0, 3}, {1, 2}};
        long[] result = rangeSum(A, B);
        for (long i : result) {
            System.out.println(i);
        }
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        long[] result = new long[B.length];
        long sum = 0;
        int s, e;
        long pSum[] = prefixSum(A);
        for (int i = 0; i < B.length; i++) {
            s = B[i][0];
            e = B[i][1];
            if (s == 0) {
                sum = pSum[e];
            } else {
                sum = pSum[e] - pSum[s - 1];
            }
            result[i] = sum;
        }
        return result;
    }

    public static long[] prefixSum(int[] A) {
        long[] pSum = new long[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pSum[i] = A[i] + pSum[i - 1];
        }
        return pSum;
    }
}
