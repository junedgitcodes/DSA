package org.example.Scaler.Day12.Assignments;

public class AmazingSubarrays {
    public static void main(String[] args) {
        String str = "ABEC";
        int result = solution(str);
        System.out.println("result = " + result);
    }

    public static int solution(String A) {
        int count = 0;
        A = A.toLowerCase();
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count = count + (A.length() - i);
            }
        }
        return count;
    }
}
