package org.example.Scaler.Day6.Class;

public class RangeBruteForce {
    public static void main(String[] args) {
        int[] A = {-5, 10, 20, 40, 35, -2, -10};
        int[][] query = {{0, 4}, {1, 2}, {2, 5}, {3, 3}};
        solve(A, query);
    }

    public static void solve(int[] arr, int[][] query) {
        int s, e;
        for (int i = 0; i < query.length; i++) {
            int sum = 0;
            s = query[i][0];
            e = query[i][1];
            for (int j = s; j <= e; j++) {
                sum += arr[j];
            }
            System.out.println(s + " " + e + ":" + sum);
        }
    }
}
