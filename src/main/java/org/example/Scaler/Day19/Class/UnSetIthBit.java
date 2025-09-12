package org.example.Scaler.Day19.Class;

public class UnSetIthBit {
    public static void main(String[] args) {
        int result = solution(6, 2);
        System.out.println("result = " + result);
    }

    public static int solution(int n, int i) {
        if (isSet(n, i)) {
            return n ^ (1 << i);
        }
        return n;
    }

    public static boolean isSet(int n, int i) {
        int value = n & (1 << i);
        return value != 0;
    }
}
