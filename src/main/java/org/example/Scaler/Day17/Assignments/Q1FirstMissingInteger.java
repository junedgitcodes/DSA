package org.example.Scaler.Day17.Assignments;

public class Q1FirstMissingInteger {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4};
        int result = firstMissingPositive(arr);
        System.out.println("result = " + result);
    }

    public static int firstMissingPositive(int[] A) {
        int i = 0;
        while (i < A.length) {
            if (A[i] < 1 || A[i] > A.length) {
                i++;
                continue;
            }
            int correctIdx = A[i] - 1;
            if (A[i] == A[correctIdx]) {
                i++;
                continue;
            }
            int temp = A[i];
            A[i] = A[correctIdx];
            A[correctIdx] = temp;

        }

        for (int j = 0; j < A.length; j++) {
            if (A[j] != j + 1) {
                return j + 1;
            }
        }
        return A.length + 1;
    }
}
