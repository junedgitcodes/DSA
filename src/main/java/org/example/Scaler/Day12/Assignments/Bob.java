package org.example.Scaler.Day12.Assignments;

public class Bob {
    public static void main(String[] args) {
        String str = "bobabtbobl";
        int result = solution(str);
        System.out.println("result = " + result);
    }

    public static int solution(String A) {

        int count = 0;
        for (int c = 0; c < A.length(); c++) {
            if (A.charAt(c) == 'o') {

                if (A.charAt(c - 1) == 'b' && A.charAt(c + 1) == 'b') {
                    count++;
                }
            }
        }
        return count;

    }
}
