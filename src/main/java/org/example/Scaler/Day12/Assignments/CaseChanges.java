package org.example.Scaler.Day12.Assignments;

public class CaseChanges {
    public static void main(String[] args) {
        String str = "tHiSiSaStRiNg";
        String result = solution(str);
        System.out.println("result = " + result);
    }

    public static String solution(String A) {
            char[] chars = A.toCharArray();

            for (int i = 0; i < A.length(); i++) {
                if (chars[i] >= 'A' && chars[i] <= 'Z') {
                    chars[i] = (char) (chars[i] + 32);
                } else {
                    chars[i] = (char) (chars[i] - 32);
                }
            }
            return new String(chars);
    }
}
