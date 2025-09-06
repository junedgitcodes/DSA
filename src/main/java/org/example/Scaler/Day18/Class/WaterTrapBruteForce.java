package org.example.Scaler.Day18.Class;

public class WaterTrapBruteForce {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 1, 2, 4, 3, 2, 1, 1, 3};
        int result = solution(arr);
        System.out.println("result = " + result);
    }

    public static int solution(int[] A) {
        int ans = 0;
        int n = A.length;
        int maxL, maxR, water;
        for (int i = 1; i <= n - 2; i++) {
            maxL = maxValue(A, 0, i - 1);
            maxR = maxValue(A, i + 1, n - 1);
            water = Math.min(maxR, maxL) - A[i];
            if (water > 0) {
                ans += water;
            }
        }
        return ans;
    }

    public static int maxValue(int[] A, int s, int e) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = s; i <= e; i++) {
            maxValue = Math.max(maxValue, A[i]);
        }
        return maxValue;
    }

}
