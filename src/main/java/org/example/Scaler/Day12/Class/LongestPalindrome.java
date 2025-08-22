package org.example.Scaler.Day12.Class;

import static java.lang.Math.max;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "adaebcdfdcbetggte";
        int result = longestSubString(str);
        System.out.println(result);
    }

    public static boolean isPalindrome(String str, int s, int e) {
        int i = s;
        int j = e;
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static int longestSubString(String str) {
        int ans = 1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (isPalindrome(str, i, j)) {
                    ans = max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
