package org.example.Scaler.Day9.Assignments;

import java.util.Arrays;

public class Q2NobleInteger {
    public static void main(String[] args) {
        int[] A = {5, 6, 2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int count = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && A[i] == A[i + 1]) {
                continue;
            }
            if (A[i] == (n - i - 1)) {
                return 1;
            }
        }
        return -1;
    }
}
