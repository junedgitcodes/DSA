package org.example.Scaler.Day8.Assignments;

public class Q1SumOfAllSubArrays {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        long result = subArrayTotal(arr);
        System.out.println("result = " + result);
    }

    public static long subArrayTotal(int[] A) {
        long totalSum = 0;
        for (int i = 0; i < A.length; i++) {
            long contribution = A[i] * (i + 1) * (A.length - i);
            totalSum += contribution;
        }
        return totalSum;
    }
}
