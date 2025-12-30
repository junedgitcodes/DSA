package org.example.Scaler.Day12.Assignments;

public class Q3ToggleCase {
    public static void main(String[] args) {
        String A = "abAPck";
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        int n = A.length();
        char[] chars = A.toCharArray();

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                chars[i] = (char) (ch + 32);
            } else {
                chars[i] = ch;
            }
        }
        return new String(chars);
    }
}
