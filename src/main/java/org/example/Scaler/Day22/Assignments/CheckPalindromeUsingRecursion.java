package org.example.Scaler.Day22.Assignments;

public class CheckPalindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println(solve("madam"));
    }

    public static int solve(String A) {
        boolean result = isPalindrome(A, 0, A.length()-1);
        if (result) {
            return 1;
        } else {
            return 0;
        }
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
