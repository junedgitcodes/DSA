package org.example.Scaler.Day3.Assignments;

import java.util.Arrays;

public class Q1GoodPairOptimized {
    public static void main(String[] args) {
        int[] A = {1, 2, 4};
        System.out.println(solve(A, 4));
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        while (i < j) {
            if (A[i] + A[j] == B) {
                return 1;
            } else if (B > (A[i] + A[j])) {
                i++;
            } else {
                j--;
            }
        }
        return 0;
    }
}
