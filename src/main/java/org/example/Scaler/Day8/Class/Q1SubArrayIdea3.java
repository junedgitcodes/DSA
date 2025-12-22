package org.example.Scaler.Day8.Class;

public class Q1SubArrayIdea3 {

    public static void main(String[] args) {
        int[] arr = {3, 2, 5};
        int result = subArrayTotal(arr);
        System.out.println("result = " + result);
    }

    public static int subArrayTotal(int[] A) {
        int totalSum = 0;
        for (int s = 0; s < A.length; s++) {
            int sum = 0;
            for (int e = s; e < A.length; e++) {
                sum += A[e];
                totalSum += sum;
            }
        }
        return totalSum;
    }


}
