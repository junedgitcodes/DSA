package org.example.Scaler.Day20.Class;

public class SubArrayOrIsZero {
    public static void main(String[] args) {
        int[] A = {1, 0, 0, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int zeroes = 0;
        int ans = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                zeroes++;
            } else {
                ans += (zeroes * (zeroes + 1)) / 2;
                zeroes = 0;
            }
        }
        ans += (zeroes * (zeroes + 1)) / 2;
        return ans;
    }
}
