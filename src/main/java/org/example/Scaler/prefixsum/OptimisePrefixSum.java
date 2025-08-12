package org.example.Scaler.prefixsum;

public class OptimisePrefixSum {

    public static void main(String[] args) {

        int[] arr = {10, 32, 6, 12, 20, 1};
        int [] pSum = pSum(arr);
        for(int i =0 ;i<pSum.length;i++){
            System.out.println("pSum[i] = " + pSum[i]);
        }
 
    }

    public static int[] pSum(int[] arr) {
        int[] pSum = new int[arr.length];
        pSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pSum[i] = arr[i] + pSum[i - 1];
        }
        return pSum;
    }
}
