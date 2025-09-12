package org.example.Scaler.Day19.Class;

public class IsSet {
    public static void main(String[] args) {
        boolean result = checkIthSetBit(45, 2);
        if (result) {
            System.out.println("Nth digit is set");
        } else {
            System.out.println("Nth digit is not set");
        }


    }

    static boolean checkIthSetBit(int n, int i) {
        int value = n & (1 << i);
        return value != 0;
    }
}
