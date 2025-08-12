package org.example.Scaler.carryForward;

public class CarryForwardOptimise1 {
    public static void main(String[] args) {

        String s = "bcaggaag";

        int aCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            } else if (s.charAt(i) == 'g') {
                count = count + aCount;
            }
        }
        System.out.println("count = " + count);
    }
}
