package org.example.Scaler.Day4.Assignments;

public class Q3ArrayRotation {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 6, 2, 4, 9};
        int[] result = solve(A, 2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] solve(int[] A, int K) {
        int N = A.length;
        K = K % N;
        reverse(A, N, 0, N - 1);
        reverse(A, N, 0, K - 1);
        reverse(A, N, K, N - 1);
        return A;
    }

    public static void reverse(int[] A, int N, int s, int e) {
        int temp;
        int i = s;
        int j = e;
        while (i <= j) {
            temp = A[j];
            A[j] = A[i];
            A[i] = temp;
            i++;
            j--;
        }
    }
}
