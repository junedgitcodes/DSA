package org.example.Scaler.Day6.Assignments;

public class Q6SubArrayInGivenRange {
    public static void main(String[] args) {
        int[] A = {8, 7, 7, 6, 6, 3, 1, 5, 7};//8,7,7,6
        int B = 0;
        int C = 2;
        int[] result = solve(A, B, C);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] solve(int[] A, int B, int C) {
        int diff = C - B + 1;
        int[] result = new int[diff];
        int idx = 0;
        for (int i = B; i <= C; i++) {
            result[idx++] = A[i];
        }
        return result;
    }
}
