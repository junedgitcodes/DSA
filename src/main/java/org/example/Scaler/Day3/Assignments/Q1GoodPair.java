package org.example.Scaler.Day3.Assignments;

public class Q1GoodPair {
    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4};
        int B = 7;
        int result = solve(A, B);
        System.out.println(result);
    }

    public static int solve(int[] A, int B) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (B == A[i] + A[j]) {
                    result = 1;
                }
            }
        }
        return result;
    }
}
