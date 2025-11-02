package org.example.Scaler.Day27.Class.Comparator;

import java.util.Arrays;

public class ComparatorMain {
    public static void main(String[] args) {
        Integer[] A = {9, 3, 10, 6, 4};
        Arrays.sort(A, new FactorComparator());
        for(int el : A) {
            System.out.print(el+" ");
        }
    }
}


