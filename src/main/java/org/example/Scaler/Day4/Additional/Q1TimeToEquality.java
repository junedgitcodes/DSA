package org.example.Scaler.Day4.Additional;

public class Q1TimeToEquality {
    public static void main(String[] args) {
        int[] A = {2, 4, 1, 3, 2};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int time = 0;
        int max = max(A);
        for (int num : A) {
            int diff = max - num;
            time = time + diff;
        }
        return time;
    }

    public static int max(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int num : A) {
            max = Math.max(max, num);
        }
        return max;
    }
}
