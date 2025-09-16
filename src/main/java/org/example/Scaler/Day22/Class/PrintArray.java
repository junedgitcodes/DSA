package org.example.Scaler.Day22.Class;

public class PrintArray {
    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8, 3, 6};
        helper(A,0);
    }

    public static void helper(int[] A, int idx) {
        if (idx == A.length) {
            return;
        }
        System.out.println(A[idx]);
        helper(A, idx + 1);
    }
}
