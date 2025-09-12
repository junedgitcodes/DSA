package org.example.Scaler.Day19.Assignments;

public class ToggleIthBit {
    public static void main(String[] args) {
        System.out.println(solve(4, 1));
    }

    public static int solve(int A, int B) {
        return A ^ (1 << B);
    }
}
