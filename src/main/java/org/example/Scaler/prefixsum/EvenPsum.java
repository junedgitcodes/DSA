package org.example.Scaler.prefixsum;

public class EvenPsum {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 6, 4, 5};
        int[] result = evenPSum(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        int[] oddPsum = oddPSum(arr);
        for (int i = 0; i < oddPsum.length; i++) {
            System.out.print(oddPsum[i] + " ");
        }

    }

    public static int[] evenPSum(int[] arr) {

        int[] pSum = new int[arr.length];

        pSum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSum[i] = arr[i] + pSum[i - 1];
            } else {
                pSum[i] = pSum[i - 1];
            }
        }

        return pSum;
    }

    public static int[] oddPSum(int[] arr) {
        int[] pSum = new int[arr.length];

        pSum[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSum[i] = pSum[i - 1];
            } else {
                pSum[i] = arr[i] + pSum[i - 1];
            }
        }
        return pSum;
    }
}
