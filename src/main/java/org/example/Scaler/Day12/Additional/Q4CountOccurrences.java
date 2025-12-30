package org.example.Scaler.Day12.Additional;

public class Q4CountOccurrences {
    public static void main(String[] args) {
        String A = "abobc";
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        int ans = 0;
        for (int i = 1; i < A.length() - 1; i++) {
            if (A.charAt(i) == 'o' || A.charAt(i) == 'O') {
                if (A.charAt(i - 1) == 'b' && A.charAt(i + 1) == 'b') {
                    ans = ans + 1;
                }
            }
        }
        return ans;
    }
}
