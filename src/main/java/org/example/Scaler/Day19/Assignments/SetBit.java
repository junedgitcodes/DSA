package org.example.Scaler.Day19.Assignments;

public class SetBit {
    public static void main(String[] args) {
        int result = solve(3, 5);
        System.out.println("result = " + result);
    }

    public static int solve(int A, int B) {
        int ans = 0;

         ans = ans ^ (1 << A);
        ans = ans ^(1<<B);
        return ans;
    }
}
