package org.example.Scaler.Day6.Assignments;

public class Q2GenerateAllSubArrays {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] result = solve(A);
        for (int[] ints : result) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] solve(int[] A) {
        int n = A.length;
        int total = (n * (n + 1)) / 2;
        int[][] result = new int[total][];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int length = j - i + 1;
                int[] sub = new int[length];
                for (int k = i; k <= j; k++) {
                    sub[k - i] = A[k];
                }
                result[index++] = sub;
            }
        }
        return result;
    }
}
