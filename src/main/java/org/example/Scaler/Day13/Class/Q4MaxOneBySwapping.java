package org.example.Scaler.Day13.Class;

public class Q4MaxOneBySwapping {
    public static void main(String[] args) {
        int[] A = {1, 1, 0, 1, 1, 0, 0, 0};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int totalOnes = 0;
        for (int a : A) {
            if (a == 1) {
                totalOnes++;
            }
        }
        int ans = 0;
        boolean isZeroFound = false;
        int j = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                isZeroFound = true;
                int l = 0;
                int r = 0;
                j = i - 1;
                while (j >= 0 && A[j] == 1) {
                    l++;
                    j--;
                }
                j = i + 1;
                while (j < A.length && A[j] == 1) {
                    r++;
                    j++;
                }
                int total = l + r + 1;
                ans = Math.max(ans, Math.min(total, totalOnes));
            }
        }
        if (!isZeroFound) {
            ans = A.length;
        }
        return ans;
    }
}
