package org.example.Scaler.Day12.Class;

public class Palindrome {

    public static void main(String[] args) {
        String str = "anamadamspe";
        boolean result = isPalindrome(str, 3, 7);
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
}
