package org.example.Scaler.Day2.Class;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 12;
        int count = Factors.solution(num);
        if (count == 2) {
            System.out.println("Is prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
