package org.example.Scaler.Day22.Class;

public class PowerOfA2 {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }

    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        int sa = pow(a, n / 2);
        if (n % 2 == 0) {
            return sa * sa;
        }
        return sa * sa * a;
    }
}
