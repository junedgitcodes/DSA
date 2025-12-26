package org.example.Scaler.Day9.Assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q1KthSmallestElement {
    public static void main(String[] args) {
        int[] A = {2, 1, 4, 3, 2};
        int B = 3;
        System.out.println(kthsmallest(A, B));

    }

    public static int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);//1,2,2,3,4
        return A[B - 1];
    }
}
