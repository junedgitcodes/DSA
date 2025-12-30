package org.example.Scaler.Day12.Class;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
    }

    public static boolean isPalindrome(String A) {
        int s = 0;
        int e = A.length() - 1;
        if(A==null || A.length()<=1){
            return true;
        }
        while (s < e) {
            if (A.charAt(s) != A.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
