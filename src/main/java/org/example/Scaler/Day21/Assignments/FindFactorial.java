package org.example.Scaler.Day21.Assignments;

public class FindFactorial {
    public static void main(String[] args) {
        System.out.println(solve(4));
    }

    public static int solve(int A) {
        if (A == 0 || A == 1) {
            return 1;
        }
        int sa = solve(A - 1);
        return sa * A;

    }
}
