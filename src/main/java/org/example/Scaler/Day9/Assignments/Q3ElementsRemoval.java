package org.example.Scaler.Day9.Assignments;

import java.util.Arrays;

public class Q3ElementsRemoval {
    public static void main(String[] args) {
        int[] A = {1, 3, 4, 2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int k = 1;
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += A[i] * k;
            k++;
        }
        return sum;
    }
}
