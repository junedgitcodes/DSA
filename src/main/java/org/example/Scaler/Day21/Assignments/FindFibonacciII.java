package org.example.Scaler.Day21.Assignments;

public class FindFibonacciII {
    public static void main(String[] args) {
        int result = findAthFibonacci(9);
        System.out.println("result = " + result);
    }

    public static int findAthFibonacci(int A) {
        if (A == 0 || A == 1) {
            return A;
        }
        int first = findAthFibonacci(A - 1);
        int second = findAthFibonacci(A - 2);
        return first + second;
    }
}
