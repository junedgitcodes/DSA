package org.example.Scaler.Day27.Assignments;

import org.example.Scaler.Day27.Class.Comparator.FactorComparator;

import java.util.Arrays;

public class Q2FactorsSortMain {

    public static void main(String[] args) {
        Integer[] A = {9, 3, 10, 6, 4};
        Arrays.sort(A, new FactorComparator());
        for (int el : A) {
            System.out.print(el + " ");
        }
    }
}
