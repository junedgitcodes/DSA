package org.example.Scaler.Day17.Assignments;

public class Q2SumOfAllSubmatrices {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(solve(arr));
    }

    public static int solve(int[][] A) {
        int ans = 0;
        int n = A.length;
        int m = A[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int start = (i + 1) * (j + 1);
                int end = (n - i) * (m - j);
                int occ = start * end;
                ans += A[i][j] * occ;
            }
        }
        return ans;
    }
}
