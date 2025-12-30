package org.example.Scaler.Day12.Additional;

public class Q3IsalNum {
    public static void main(String[] args) {
        char[] ch = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println(solve(ch));
    }

    public static int solve(char[] A) {
        for (int i = 0; i < A.length; i++) {
            char ch = A[i];
            if (!isAlphabet(ch) && !isNumber(ch)) {
                return 0;
            }
        }
        return 1;
    }

    public static boolean isAlphabet(char ch) {
        if (ch >= 'a' && ch <= 'z') {
            return true;
        } else if (ch >= 'A' && ch <= 'Z') {
            return true;
        }
        return false;
    }

    public static boolean isNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

}
