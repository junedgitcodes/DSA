package org.example.Scaler.Day7.Class;

public class Q3ClosestMinMax {
    public static void main(String[] args) {
        int[] A = {343, 291, 963, 165, 152};
        int result = solve(A);
        System.out.println("result = " + result);
    }

    public static int solve(int[] A) {
        int min = min(A);
        int max = max(A);
        int last_min_occurrence = -1;
        int last_max_occurrence = -1;
        int ans = Integer.MAX_VALUE;
        if (min == max) {
            return 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] == min) {
                if (last_max_occurrence != -1) {
                    ans = Math.min(ans, Math.abs(i - last_max_occurrence + 1));
                }
                last_min_occurrence = i;
            }
            if (A[i] == max) {
                if (last_min_occurrence != -1) {
                    ans = Math.min(ans, Math.abs(i - last_min_occurrence + 1));
                }
                last_max_occurrence = i;
            }
        }
        return ans;
    }

    public static int min(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int i : A) {
            min = Math.min(min, i);
        }
        return min;
    }

    public static int max(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            max = Math.max(max, i);
        }
        return max;
    }
}
