package org.example.Scaler.Day3.Class;

public class Reverse {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};
        reverserArray(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static int[] reverserArray(int[] A) {
        int i = 0;
        int j = A.length - 1;

        while (i <= j) {
            int temp = A[j];
            A[j] = A[i];
            A[i] = temp;
            i++;
            j--;
        }
        return A;
    }
}
