package org.example.Scaler.Day9.Assignments;

import java.util.Arrays;

public class KthElement {
    public static void main(String[] args) {
        int[] arr = {-10, -11, -9, 9, 4, 2, 4, 5};
        int k = 2;
        int result = kthsmallest(arr, k);
        System.out.println("result = " + result);

    }

    static public int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);
        return A[B-1];
    }
}
