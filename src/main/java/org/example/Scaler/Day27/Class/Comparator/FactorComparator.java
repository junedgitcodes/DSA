package org.example.Scaler.Day27.Class.Comparator;

import java.util.Comparator;

public class FactorComparator implements Comparator<Integer> {
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
            } else if (a > b) {
                return 1;
            }
            return 0;
        }
    }

    public static int countFactor(int num) {

        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num)
                    count += 1;  // perfect square, count only once
                else
                    count += 2;  // i and num/i
            }
        }
        return count;
    }
}
