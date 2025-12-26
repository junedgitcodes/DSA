package org.example.Scaler.Day2.Class;

public class Factors {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(solution(num));
    }


    public static int solution(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num == i * i) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }
}
