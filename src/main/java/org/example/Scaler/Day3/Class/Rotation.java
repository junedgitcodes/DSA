package org.example.Scaler.Day3.Class;

public class Rotation {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        rotate(A, A.length, 2);
        for (int a : A) {
            System.out.print(a + " ");
        }
    }

    public static void rotate(int[] A, int N, int k) {
        k = k % N;
        reverse(A, N, 0, N - 1);
        reverse(A, N, 0, k - 1);
        reverse(A, N, k, N - 1);
    }

    public static void reverse(int[] A, int N, int s, int e) {
        int i = s;
        int j = e;
        int temp;
        while (i <= j) {
            temp = A[j];
            A[j] = A[i];
            A[i] = temp;
            i++;
            j--;
        }
    }
}
