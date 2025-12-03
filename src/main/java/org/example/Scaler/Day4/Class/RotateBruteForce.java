package org.example.Scaler.Day4.Class;

public class RotateBruteForce {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        rotate(A, A.length, 25);
        for (int a : A) {
            System.out.print(a + " ");
        }
    }

    public static void rotate(int[] A, int N, int k) {
        int temp;
        k = k % N;
        for (int rot = 0; rot < k; rot++) {
            temp = A[N - 1];
            for (int i = N - 1; i > 0; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
        }
    }
}
