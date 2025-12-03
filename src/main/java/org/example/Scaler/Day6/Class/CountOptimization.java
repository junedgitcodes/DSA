package org.example.Scaler.Day6.Class;

public class CountOptimization {
    public static void main(String[] args) {
        String s = "bcaggaag";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int count = 0;
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countA++;
            } else if (s.charAt(i) == 'g') {
                count = countA + count;
            }
        }
        return count;
    }
}
