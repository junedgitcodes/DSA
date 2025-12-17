package org.example.Scaler.Day7.Class;

public class Q1SpecialIndices {
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 7, 6, -2};//{0,3,3,10,10,8}PoSum  //3,2,7,6,-2
        System.out.println(sIndices(A));//{4,4,6,6,13,13,11}peSum
    }

    public static int sIndices(int[] A) {
        int n = A.length;
        int[][] pSum = pSum(A);
        int count = 0;
        int[] evenPSum = pSum[0];
        int[] oddPSum = pSum[1];
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                evenSum = oddPSum[n - 1] - oddPSum[i];
                oddSum = evenPSum[n - 1] - evenPSum[i];
            } else {
                evenSum = evenPSum[i - 1] + oddPSum[n - 1] - oddPSum[i];
                oddSum = oddPSum[i - 1] + evenPSum[n - 1] - evenPSum[i];
            }
            if (evenSum == oddSum) {
                count++;
            }
        }
        return count;
    }

    public static int[][] pSum(int[] A) {
        int[][] result = new int[2][A.length];
        int[] evenPSum = new int[A.length];
        int[] oddPSum = new int[A.length];
        evenPSum[0] = A[0];
        oddPSum[0] = 0;
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                evenPSum[i] = evenPSum[i - 1] + A[i];
                oddPSum[i] = oddPSum[i - 1];
            } else {
                evenPSum[i] = evenPSum[i - 1];
                oddPSum[i] = oddPSum[i - 1] + A[i];
            }
        }
        result[0] = evenPSum;
        result[1] = oddPSum;
        return result;
    }
}
