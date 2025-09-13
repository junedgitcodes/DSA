package org.example.Scaler.Day20.Assignments;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int zeros = 0;
            int ones = 0;
            for (int j = 0; j < A.length; j++) {
                if (isSet(A[j], i)) {
                    ones++;
                } else {
                    zeros++;
                }
            }
            if (ones % 3 != 0) {
                ans += Math.pow(2, i);
            }
        }
        return ans;
    }

    public static boolean isSet(int A, int B) {
        return (A & (1 << B)) != 0;
    }
}
