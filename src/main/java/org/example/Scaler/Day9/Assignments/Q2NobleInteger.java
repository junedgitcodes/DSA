package org.example.Scaler.Day9.Assignments;

import java.util.Arrays;

public class Q2NobleInteger {
    public static void main(String[] args) {
        int[] A = {5, 6, 2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);//2,5,6
        int count = 0;
        int n = A.length;
        if (A[0] == n - 1) {
            return 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[n] != A[n - 1]) {
                count = i;
            }
            if (A[i] == n - i - 1) {
                return 1;
            }

        }
        return -1;
    }
}
