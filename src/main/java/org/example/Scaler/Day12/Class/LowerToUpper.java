package org.example.Scaler.Day12.Class;

public class LowerToUpper {
    public static void main(String[] args) {
        String str = "Hello wOrLd 987";
        System.out.println(convertString(str));
    }

    public static String convertString(String A) {
        char[] characters = A.toCharArray();
        for (int i = 0; i < A.length(); i++) {
            char ch = characters[i];
            if (ch >= 'a' && ch <= 'z') {
                characters[i] = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                characters[i] = (char) (ch + 32);
            }
        }
        return new String(characters);
    }
}
