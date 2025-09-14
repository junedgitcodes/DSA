package org.example.Scaler.Day21.Class;

public class PrintNoInIncreasing {
    public static void main(String[] args) {

        printNo(5);
    }

    public static void printNo(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printNo(n - 1);
        System.out.println(n);
    }
}
