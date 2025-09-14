package org.example.Scaler.Day21.Assignments;

public class DecreasingIncreasingInOneFunction {
    public static void main(String[] args) {
        solve(1);
    }

    public static void solve(int A) {
        increasing(A);
        decreasing(A);
        System.out.println();
    }

    public static void increasing(int A) {
        if (A == 0) {
            return;
        }
        increasing(A - 1);
        System.out.print(A + " ");
    }

    public static void decreasing(int A) {
        if (A == 0) {
            return;
        }
        System.out.print(A + " ");
        decreasing(A - 1);

    }

}
