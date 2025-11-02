package org.example.Scaler.Day27.Assignments;

import java.util.Comparator;

public class Q2FactorSort implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        int fact1 = countFactor(a);
        int fact2 = countFactor(b);
        if (fact1 < fact2) {
            return -1;
        } else if (fact1 > fact2) {
            return 1;
        } else {
            if (a < b) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public static int countFactor(int a) {
        int count = 0;
        for (int i = 1; i * i <= a; i++) {
            if (a % i == 0) {
                if (i * i == a)
                    count += 1;  // perfect square, count only once
                else
                    count += 2;  //
            }
        }
        return count;
    }
}
