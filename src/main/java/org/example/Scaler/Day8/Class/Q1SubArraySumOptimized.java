package org.example.Scaler.Day8.Class;

public class Q1SubArraySumOptimized {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int result = subArrayTotal(arr);
        System.out.println("result = " + result);
    }

    public static int subArrayTotal(int[] A) {
        int totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            int contribution = A[i] * (i + 1) * (A.length - i);
            totalSum += contribution;
        }
        return totalSum;
    }
}
