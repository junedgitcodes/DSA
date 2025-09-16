package org.example.Scaler.Day22.Assignments;

public class FastPower {
    public static void main(String[] args) {
        System.out.println(power(2,4));
    }

    public static long power(int A, int B) {
        if (B == 0) {
            return 1;
        }
        if (B == 1) {
            return A;
        }
        long sa = power(A, B / 2);
        if (B % 2 == 0) {
            return sa * sa;
        }
        return sa * sa * A;
    }
}
