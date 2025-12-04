package org.example.Scaler.Day6.Assignments;

public class Q8SumOfEvenIndexedElementsInARange {
    public static void main(String[] args) {
        int[] A = {2, 8, 3, 9, 15};
        int[][] B = {{1, 4},
                {0, 2},
                {2, 3}};
        int[] result = sumOfEvenIndexedElements(A, B);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] sumOfEvenIndexedElements(int[] A, int[][] B) {
        int s, e;
        int sum = 0;
        int pSum[] = pSum(A);
        int[] result = new int[B.length];
        int index = 0;
        for (int i = 0; i < B.length; i++) {
            s = B[i][0];
            e = B[i][1];
            if (s == 0) {
                sum = pSum[e];
            } else {
                sum = pSum[e] - pSum[s - 1];
            }
            result[index++] = sum;
        }
        return result;
    }

    public static int[] pSum(int[] A) {
        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (i % 2 != 0) {
                pSum[i] = pSum[i - 1];
            } else {
                pSum[i] = pSum[i - 1] + A[i];
            }
        }
        return pSum;
    }
}
