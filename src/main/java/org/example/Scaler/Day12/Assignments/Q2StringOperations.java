package org.example.Scaler.Day12.Assignments;

public class Q2StringOperations {
    public static void main(String[] args) {
        String A = "aeiOUz";
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        int n = A.length();
        StringBuilder sb = new StringBuilder(2 * n);
        sb.append(A).append(A);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.deleteCharAt(i);
                i--;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }
}
