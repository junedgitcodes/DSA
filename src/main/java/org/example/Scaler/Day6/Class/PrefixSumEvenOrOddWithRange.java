package org.example.Scaler.Day6.Class;

public class PrefixSumEvenOrOddWithRange {
    public static void main(String[] args) {
        int[] A = {-5, 10, 20, 40, 35, -2, -10};
        int[][] query = {{0, 4}, {1, 2}, {2, 5}, {3, 3}};
        solution(A, query);
    }

    public static void solution(int[] arr, int[][] query) {
        int s, e;
        int[] pSum = prefixSum(arr);
        for (int i = 0; i < query.length; i++) {
            int sum;
            s = query[i][0];
            e = query[i][1];
            if (s == 0) {
                sum = pSum[e];
            } else {
                sum = pSum[e] + pSum[s - 1];
            }
            System.out.println(s + " " + e + ":" + sum);
        }
    }

    public static int[] prefixSum(int[] arr) {
        int[] pSum = new int[arr.length];
        pSum[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSum[i] = pSum[i-1];
            } else {
                pSum[i] = arr[i] + pSum[i - 1];
            }
        }
        return pSum;
    }
}
