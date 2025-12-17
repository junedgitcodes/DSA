package org.example.Scaler.Day2.Class;

public class Factors {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(solution(num));
    }


    public static int solution(int num) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                count = count + 2;
            }
        }
        return count;
    }
}
