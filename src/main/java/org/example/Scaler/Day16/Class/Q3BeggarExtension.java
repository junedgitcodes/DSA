package org.example.Scaler.Day16.Class;

public class Q3BeggarExtension {
    public static void main(String[] args) {
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int A = 5;
        int[] result = solve(A, B);
        for (int el : result) {
            System.out.print(el + " ");
        }
    }

    public static int[] solve(int A, int[][] B) {
        int[] result = new int[A];

        for (int i = 0; i < B.length; i++) {
            int sIdx = B[i][0];
            int eIdx = B[i][1];
            int value = B[i][2];
            result[sIdx-1] += value;
            if (eIdx  < A) {
                result[eIdx] -= value;
            }
        }
        for (int i = 1; i < A; i++) {
            result[i] = result[i - 1] + result[i];
        }
        return result;
    }
}
