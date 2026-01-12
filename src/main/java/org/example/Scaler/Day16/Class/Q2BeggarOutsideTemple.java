package org.example.Scaler.Day16.Class;

public class Q2BeggarOutsideTemple {
    public static void main(String[] args) {
        int[][] B = {{1, 3}, {4, 2}, {2, 1}, {1, -1}, {0, 5}};
        int A = 5;
        int[] result = solve(A, B);
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static int[] solve(int n, int[][] B) {
        int[] A = new int[n];
        for (int i = 0; i < B.length; i++) {
            int idx = B[i][0];
            int val = B[i][1];
            A[idx] += val;
        }
        for (int i = 1; i < A.length; i++) {
            A[i] = A[i - 1] + A[i];
        }
        return A;
    }


}
