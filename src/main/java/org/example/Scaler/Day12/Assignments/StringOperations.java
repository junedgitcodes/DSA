package org.example.Scaler.Day12.Assignments;

public class StringOperations {
    public static void main(String[] args) {
        String A = "aeiOUz";
        String result = solution(A);
        System.out.println("result = " + result);
    }

    public static String solution(String A) {
        A = A.concat(A);
        StringBuilder B = new StringBuilder("");

        for (int i = 0; i < A.length(); i++) {
            if (!Character.isUpperCase(A.charAt(i))) {
                if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                    B.append('#');
                } else {
                    B.append(A.charAt(i));
                }
            }
        }
        A = B.toString();
        return A;

    }
}
