package org.example.Scaler.Day19.Class;

public class SingleNumber1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 3, 6, 2};
        int result = solve(arr);
        System.out.println("result = " + result);
    }

    public static int solve(int[] A) {
        int ans = 0;
        for (int el : A) {
            ans = ans ^ el;
        }
        return ans;
    }
}
