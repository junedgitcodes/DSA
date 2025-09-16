package org.example.Scaler.Day22.Assignments;

import org.example.Scaler.Day22.Class.PrintArray;

public class PrintArrayUsingRecursion {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, -5};
        PrintArray(A);
    }

    public static void PrintArray(int[] A) {
        helper(A, 0);
        System.out.println();
    }

    public static void helper(int[] A, int idx) {
        if (idx == A.length) {
            return;
        }
        System.out.print(A[idx]+" ");
        helper(A, idx + 1);
    }
}
