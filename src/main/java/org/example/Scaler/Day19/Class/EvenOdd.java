package org.example.Scaler.Day19.Class;

import com.sun.source.tree.BreakTree;

public class EvenOdd {
    public static void main(String[] args) {
        boolean result = evenOrOdd(-2);// dont check for -2
        if (result) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static boolean evenOrOdd(int n) {
        int value = n & 1;
        if (value == 0) {
            return true;
        }
        return false;
    }
}
