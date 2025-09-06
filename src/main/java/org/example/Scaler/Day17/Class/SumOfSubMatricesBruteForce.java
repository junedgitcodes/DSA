package org.example.Scaler.Day17.Class;

public class SumOfSubMatricesBruteForce {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = solution(A);
        System.out.println("sum = " + sum);
    }

    public static int solution(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int sum = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int start = (i + 1) * (j + 1);
                int end = (n - i) * (m - j);
                int occ = start * end;
                sum += A[i][j] * occ;
            }
        }
        return sum;
    }
}
