package org.example.Scaler.Day6.Class;

public class CountBruteForce {
    public static void main(String[] args) {
        String s = "bcaggaag";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == 'g') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
