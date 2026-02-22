package org.example.Scaler.Day18.Class;

public class Q1WaterTrap {
    public static void main(String[] args) {
        int[] A = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
        System.out.println(findMaxWaterTrap(A));
    }

    public static int findMaxWaterTrap(int[] A) {
        int n = A.length;
        int ans = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = 0;
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], A[i - 1]);
        }
        rMax[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(A[i + 1], rMax[i + 1]);
        }

        for (int i = 1; i < n - 1; i++) {
            int water = Math.min(lMax[i], rMax[i])-A[i];
            if (water > 0) {
                ans += water;
            }
        }
        return ans;
    }
}
