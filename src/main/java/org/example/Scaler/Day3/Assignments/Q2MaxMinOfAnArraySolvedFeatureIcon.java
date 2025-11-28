package org.example.Scaler.Day3.Assignments;

public class Q2MaxMinOfAnArraySolvedFeatureIcon {
    public static void main(String[] args) {
        int[] A = {-2, 1, -4, 5, 3};
        System.out.println(solve(A));

    }

    public static int solve(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : A) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max + min;
    }
}
