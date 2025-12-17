package org.example.Scaler.Day7.Assignment;

public class Q5SumOfOddIndexedElementsInARange {
    public static void main(String[] args) {
        int[] A = {2, 8, 3, 9, 15};//0
        int[][] B = {{1, 4},
                {0, 2},
                {2, 3}};
        int[] result = solve(A, B);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solve(int[] A, int[][] B) {
        int[] pSum = pSum(A);
        int[] result = new int[B.length];
        int sum = 0;
        int s = 0;
        int e = 0;
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

    public static int[] pSum(int[] A) {
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
