package org.example.Scaler.Day24.Class;

public class PairBruteForce {
    public static void main(String[] args) {
        int[] A = {8, 9, 1, -2, 4, 5, 11, -6, 4};
        int k = 6;
        System.out.println(solve(A, k));
    }

    public static boolean solve(int[] A, int B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] + A[j] == B) {
                    return true;
                }
            }
        }
        return false;
    }
}
