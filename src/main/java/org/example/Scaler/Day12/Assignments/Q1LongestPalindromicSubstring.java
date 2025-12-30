package org.example.Scaler.Day12.Assignments;

public class Q1LongestPalindromicSubstring {
    public static void main(String[] args) {
        String A = "abbcccbbbcaaccbababcbcabca";//aaabaaa   7 1 8
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        //take two integers i and j to store start and ending index
        //ierate over string to find longest palindrome string
        // create a function to find the longest substring using that point both for odd and even string
        //call this function two times for even and odd
        //compare which value is max evertime if ur value exceed max value update i and j
        //return string from i to j
        int start = 0;
        int end = 0;
        int ans = 1;
        for (int i = 0; i < A.length(); i++) {
            int len1 = longestPalindromeWithCenter(A, i, i);
            int len2 = longestPalindromeWithCenter(A, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return A.substring(start, end + 1);
    }

    public static int longestPalindromeWithCenter(String A, int left, int right) {
        while (left >= 0 && right < A.length() && A.charAt(left) == A.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

