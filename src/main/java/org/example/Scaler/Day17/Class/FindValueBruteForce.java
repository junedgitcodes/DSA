package org.example.Scaler.Day17.Class;

public class FindValueBruteForce {
    public static void main(String[] args) {
        int[][] arr = {{-5, -2, 1, 13}, {-4, 0, 3, 14}, {-3, 2, 6, 18}};
        int k = 5;
        boolean result = solution(arr, k);
        System.out.println("result = " + result);
    }

    public static boolean solution(int[][] A, int k) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
