package org.example.Scaler.Day18.Class;

public class MaxWaterTrap {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
        int result = solution(arr);
        System.out.println("result = " + result);
    }

    public static int solution(int[] A) {
        int ans = 0;
        int n = A.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0] = 0;
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], A[i - 1]);
        }

        rmax[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], A[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            int water = Math.min(lmax[i], rmax[i]) - A[i];
            if (water > 0) {
                ans += water;
            }
        }
        return ans;
    }
}
