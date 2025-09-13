package org.example.Scaler.Day20.Class;

public class NoOfSetBits {
    public static void main(String[] args) {
        System.out.println("Result: " + countSetBits(12));
    }

    public static int countSetBits(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (checkSetBit(n, i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkSetBit(int A, int B) {
        return (A & (1 << B)) != 0;
    }
}
