package org.example.Scaler.Day7.Assignment;

import com.sun.source.tree.BreakTree;

public class Q3EvenNumbersInARange {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};//[0,1,1,2,2]
        int[][] B = {{0, 2}, {2, 4}, {1, 4}};//[1,1,1]
        int[] result = solve(A, B);
        for (int k : result) {
            System.out.println(k);
        }
    }

    public static int[] solve(int[] A, int[][] B) {
        int[] result = new int[B.length];
        int[] pSum = pSum(A);
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
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {

                count++;
            }
            pSum[i] = count;
        }
        return pSum;
    }
}
