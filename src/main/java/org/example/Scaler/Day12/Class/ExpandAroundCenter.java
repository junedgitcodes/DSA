package org.example.Scaler.Day12.Class;

public class ExpandAroundCenter {
    public static void main(String[] args) {
        String str = "adaebcdfdcbetggte";
        int result = longestPalindromeSubString(str);
        System.out.println("result = " + result);
    }

    public static int longestPalindromeSubString(String A) {
        int ans = 1;
        int n = A.length();
        for (int c = 0; c < n; c++) {
            int len1 = maxPal(A, c, c);
            int len2 = maxPal(A, c, c + 1);
            int len = Math.max(len1, len2);
            ans = Math.max(ans, len);
        }
        return ans;
    }

    public static int maxPal(String A, int left, int right) {

        while (left >= 0 && right < A.length() && A.charAt(left) == A.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
