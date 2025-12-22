package org.example.Scaler.Day8.Class;

public class Q2AllSubArrayWithLengthK {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 8};//5-3
        int k = 3;
        subArrayWithLengthK(arr, k);
    }

    public static void subArrayWithLengthK(int[] A, int k) {
        int n = A.length;
        for (int s = 0; s <= n - k; s++) {
            for (int e = s; e < s + k; e++) {
                System.out.print(A[e] + " ");
            }
            System.out.println();
        }
    }

}
