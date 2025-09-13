package org.example.Scaler.Day20.Class;

public class UniqueinThrice {
    public static void main(String[] args) {
        int[] A = {5, 5, 5, 11, 11, 11, 9};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < A.length; j++) {
                int val = A[j] & (1 << i);
                if (val == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (ones % 3 != 0) {
                ans += Math.pow(2, i);
            }
        }
        return ans;
    }
}
