package org.example.Scaler.Day23.Assignments;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pow(71045970,41535484,64735492));
    }
    public static int pow(int A, int B, int C) {
        long a = A;
        long c = C;

        a = Math.floorMod(a, c);
        if (c == 1) return 0;

        long result = powHelper(a, B, c);
        return (int) result;
    }

    private static long powHelper(long a, int b, long m) {
        if (b == 0) return 1 % m;
        if (b == 1) return a % m;

        long halfPow = powHelper(a, b / 2, m);
        long result = (halfPow * halfPow) % m;

        if (b % 2 == 1) {
            result = (result * a) % m;
        }

        return result;
    }
}
