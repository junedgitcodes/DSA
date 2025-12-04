package org.example.Scaler.Day6.Assignments;

public class Q7SpecialSubsequencesAG2 {
    public static void main(String[] args) {
        String s = "ABCGAG";
        System.out.println(solve(s));
    }

    public static long solve(String A) {
        long countA = 0;
        long count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'A') {
                countA++;
            } else if (A.charAt(i) == 'G') {
                count = count + countA;
            }
        }
        return count;
    }
}
