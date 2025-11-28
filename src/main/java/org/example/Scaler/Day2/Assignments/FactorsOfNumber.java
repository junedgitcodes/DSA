package org.example.Scaler.Day2.Assignments;

public class FactorsOfNumber {
    public static void main(String[] args) {
        System.out.println(factors(25));
    }

    public static int factors(int A) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(A); i++) {
            if (A == i * i) {
                count++;
            }
            else if (A % i == 0) {
                count = count + 2;
            }
        }
        return count;
    }
}
