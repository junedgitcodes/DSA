package org.example.Scaler.prefixsum;

public class FinalPSum {

    public static void main(String[] args) {
        int[] arr = {-5, 10, 20, 40, 35, -1, -10};
        int[][] queries = {{0, 4}, {1, 2}, {2, 5}, {3, 4}, {2, 2}};
        pSum(arr, queries);
    }

    public static void pSum(int[] arr, int[][] queries) {
        int pSum[] = OptimisePrefixSum.pSum(arr);
        int s, e, sum;

        for (int i = 0; i < queries.length; i++) {
            s = queries[i][0];
            e = queries[i][1];

            if (s == 0) {
                sum = pSum[e];
            } else {
                sum = pSum[e] - pSum[s - 1];
            }
            System.out.println("sum = " + sum);
        }

    }
}
