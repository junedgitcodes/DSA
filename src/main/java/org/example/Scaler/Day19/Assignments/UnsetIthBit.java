package org.example.Scaler.Day19.Assignments;

public class UnsetIthBit {
    public static void main(String[] args) {
        System.out.println("solve(5,2) = " + solve(5,2));

    }

    public static int solve(int A, int B) {
        if (isSet(A, B)) {
            return A ^ (1 << B);
        }
        return A;
    }

    public static boolean isSet(int A, int B) {
        return (A & (1 << B)) != 0;
    }
}
