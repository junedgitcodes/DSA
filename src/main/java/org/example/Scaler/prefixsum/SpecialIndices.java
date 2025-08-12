package org.example.Scaler.prefixsum;

public class SpecialIndices {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 6, -2};
        int[] pSumEven = pSumEven(arr);
        int[] pSumOdd = pSumOdd(arr);
        int count = 0;
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                sumOdd = pSumEven[arr.length - 1] - pSumEven[i];
                sumEven = pSumOdd[arr.length - 1] - pSumOdd[i];

            } else {
                sumOdd = pSumOdd[i - 1] + pSumEven[arr.length - 1] - pSumEven[i];
                sumEven = pSumEven[i - 1] + pSumOdd[arr.length - 1] - pSumOdd[i];
            }
            if (sumOdd == sumEven) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }


    public static int[] pSumEven(int[] arr) {
        int[] pSumE = new int[arr.length];
        pSumE[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                pSumE[i] = arr[i] + pSumE[i - 1];
            } else {
                pSumE[i] = pSumE[i - 1];
            }
        }
        return pSumE;
    }

    public static int[] pSumOdd(int[] arr) {
        int[] pSumO = new int[arr.length];
        pSumO[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                pSumO[i] = arr[i] + pSumO[i - 1];
            } else {
                pSumO[i] = pSumO[i - 1];
            }
        }
        return pSumO;
    }
}
