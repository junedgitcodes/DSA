package org.example.Scaler.Day26.Assignments;

public class Q1MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] A = {2, 8, 14, 15, 18};
        int[] B = {1, 9, 10, 11, 19};

        int[] C = solve(A, B);
        for (int el : C) {
            System.out.print(el+ " ");
        }
    }

    public static int[] solve(final int[] A, final int[] B) {
        int i = 0;
        int j = 0;
        int idx = 0;
        int[] C = new int[A.length + B.length];
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[idx] = A[i];
                idx++;
                i++;
            } else {
                C[idx] = B[j];
                idx++;
                j++;
            }
        }
        while (i < A.length) {
            C[idx] = A[i];
            idx++;
            i++;
        }
        while (j < B.length) {
            C[idx] = B[j];
            idx++;
            j++;
        }
        return C;
    }
}
