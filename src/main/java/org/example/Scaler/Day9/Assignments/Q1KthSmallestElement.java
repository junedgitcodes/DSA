package org.example.Scaler.Day9.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1KthSmallestElement {
    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2}; //1,2,2,3,4
        int B = 3;
        System.out.println(kthsmallest(A, B));

    }

    public static int kthsmallest(final int[] A, int B) {
        int n = A.length;
        for (int i = 0; i < B; i++) {
            int smallestIdx = 0;
            for (int j = i + 1; j < n; j++) {
                if (A[smallestIdx] > A[j]) {
                    smallestIdx = j;
                }
            }
            int temp = A[smallestIdx];
            A[smallestIdx] = A[i];
            A[i] = temp;
        }
        return A[B - 1];
    }
}
