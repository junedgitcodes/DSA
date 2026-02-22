package org.example.Scaler.Day18.Class;

public class Q1WaterTrapBrutForce {
    public static void main(String[] args) {
        int[] A = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 3, 1};
        System.out.println(findMaxWaterTrap(A));
    }

    public static int findMaxWaterTrap(int[] A) {
        int ans = 0;
        int n = A.length;
        for (int i = 1; i < n - 1; i++) {
            int maxL = findMax(A, 0, i - 1);
            int maxR = findMax(A, i + 1, n - 1);
            int water = (Math.min(maxR, maxL) - A[i]);
            if (water > 0) {
                ans += water;
            }
        }
        return ans;
    }

    public static int findMax(int[] A, int s, int e) {
        int ans = A[s];
        for (int i = s; i <= e; i++) {
            ans = Math.max(A[i], ans);
        }
        return ans;
    }
}
