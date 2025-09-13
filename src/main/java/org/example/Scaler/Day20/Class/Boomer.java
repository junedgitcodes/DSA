package org.example.Scaler.Day20.Class;

public class Boomer {
    public static void main(String[] args) {
        System.out.println("Result: " + solve(13));
    }

    public static int solve(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (isSet(n, i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSet(int A, int B) {
        return (A & (1 << B)) != 0;
    }
}
