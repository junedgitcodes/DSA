package org.example.Scaler.prefixsum;

public class SpecialIndicesBF {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 7, 6, -2};
        int count = 0;
        int sumE = 0, sumO = 0;
        for (int i = 0; i < arr.length; i++) {
            int[] dummy = new int[arr.length];
            for (int j = 0; j < arr.length - 1; j++) {
                if (j != i) {
                    dummy[j] = arr[j];
                }
            }
            for (int k = 0; k < dummy.length; k++) {
                if (i % 2 == 0) {
                    sumE += dummy[i];
                } else {
                    sumO += dummy[i];
                }
            }
            if (sumO == sumE) {
                count++;
            }
        }
    }
}
