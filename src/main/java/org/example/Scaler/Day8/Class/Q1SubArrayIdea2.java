package org.example.Scaler.Day8.Class;

public class Q1SubArrayIdea2 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int result = subArrayTotal(arr);
        System.out.println("result = " + result);
    }

    //3,5,10   3+2+7
    //3+5+10+2+7+5=32
    public static int subArrayTotal(int[] arr) {
        int[] pSum = pSum(arr);
        int totalSum = 0;
        for (int s = 0; s < arr.length; s++) {
            int sum = 0;
            for (int e = s; e < arr.length; e++) {
                if (s == 0) {
                    sum = pSum[e];
                } else {
                    sum = pSum[e] - pSum[s - 1];
                }
                totalSum += sum;
            }
        }
        return totalSum;
    }

    private static int[] pSum(int[] A) {
        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            pSum[i] = pSum[i - 1] + A[i];
        }
        return pSum;
    }
}
