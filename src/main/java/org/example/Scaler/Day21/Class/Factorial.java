package org.example.Scaler.Day21.Class;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(5));
    }

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int sa = fact(n - 1);
        int fa = sa * n;
        return fa;
    }
}
