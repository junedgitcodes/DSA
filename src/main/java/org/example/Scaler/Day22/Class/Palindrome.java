package org.example.Scaler.Day22.Class;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(helper("madamm"));
    }

    public static boolean helper(String str) {
        return isPalindrome(str, 0, str.length() - 1);
    }

    public static boolean isPalindrome(String str, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }
        return isPalindrome(str, l + 1, r - 1);
    }
}
