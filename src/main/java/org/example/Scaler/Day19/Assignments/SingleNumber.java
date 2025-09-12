package org.example.Scaler.Day19.Assignments;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 4, 1, 6, 6};
        int result = solve(arr);
        System.out.println(result);
    }

    public static int solve(final int[] A) {
        int ans = 0;
        int[] B = new int[A.length];
        for (int el : A) {
            ans = ans ^ el;
        }
        return ans;
    }
}
