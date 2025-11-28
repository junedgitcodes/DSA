package org.example.Scaler.Day3.Assignments;

public class Q4ReverseInARange {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 6, 2, 4, 9};

        solve(A, 2, 3);
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

    public static int[] solve(int[] A, int B, int C) {

        reverse(A, A.length, B, C);
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
