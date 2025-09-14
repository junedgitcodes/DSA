package org.example.Scaler.Day21.Class;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int A) {
        if (A == 1) {
            return 1;
        }
        int sa = sum(A - 1);
        int fa = sa + A;
        return fa;
    }
}
