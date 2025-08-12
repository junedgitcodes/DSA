package org.example.Scaler.prefixsum;

public class PSumEvenValue {
    public static void main(String[] args) {

        int arr[] = {-5, 10, 20, 40, 35, -2, -10};
        int[][] queries = {{0, 4}, {1, 2}, {2, 5}, {3, 4}, {2, 2}};
        pSumWithQueries(arr,queries);
    }

    public static int[] pSumEVal(int[] arr) {
        int[] pSumEVal = new int[arr.length];
        pSumEVal[0] = arr[0] % 2 == 0 ? arr[0] : 0;
        for (int i = 1; i < arr.length; i++) {
            pSumEVal[i] = pSumEVal[i - 1] + (arr[i] % 2 == 0 ? arr[i] : 0);
        }
        return pSumEVal;
    }

    public static void pSumWithQueries(int[] arr, int[][] queries) {
        int pSum[] = pSumEVal(arr);
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
