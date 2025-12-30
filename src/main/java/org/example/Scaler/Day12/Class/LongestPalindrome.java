package org.example.Scaler.Day12.Class;

import static java.lang.Math.max;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "adaebcdfdcbetggte";
        int result = longestSubString(str);
        System.out.println(result);
    }

    public static int longestSubString(String A) {
        int ans = 1;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i; j < A.length(); j++) {
                if (isPalindrome(A,i,j)){
                    ans = Math.max(ans, j-i+1);
                }
            }
        }
        return ans;
    }

    public static boolean isPalindrome(String A, int s, int e) {
        int i = s;
        int j = e;
        if (A == null || A.length() <= 1) {
            return true;
        }
        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
