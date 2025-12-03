package org.example.Scaler.Day6.Class;

public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 5, 6, 8};
        int[] result = pSum(A);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] pSum(int[] arr) {
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] = pSum[i-1] + arr[i];
        }
        return pSum;
    }
}
