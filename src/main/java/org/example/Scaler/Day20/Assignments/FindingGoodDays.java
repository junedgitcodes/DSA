package org.example.Scaler.Day20.Assignments;

public class FindingGoodDays {
    public static void main(String[] args) {
        System.out.println(solve(5));
    }

    public static int solve(int A) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (isSet(A, i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSet(int A, int B) {
        return (A & (1 << B)) != 0;
    }
}
