package org.example.Scaler.Day12.Additional;

public class Q1LongestCommonPrefix {
    public static void main(String[] args) {
        String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
        String result = solve(A);
        System.out.println(result);
    }

    public static String solve(String[] A) {
        if (A == null || A.length == 0) {
            return "";
        }

        String first = A[0];
        int n = first.length();

        for (int i = 0; i < n; i++) {
            char ch = first.charAt(i);//a

            for (int j = 1; j < A.length; j++) {

                // If index exceeds or mismatch found
                if (i >= A[j].length() || A[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }
        return first;

    }
}
