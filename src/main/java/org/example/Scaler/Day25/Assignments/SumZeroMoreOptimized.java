package org.example.Scaler.Day25.Assignments;

import java.util.HashSet;
import java.util.Set;

public class SumZeroMoreOptimized {
    public static void main(String[] args) {
        int[] A = {1, 2, -3, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A){
        Set<Long> set = new HashSet<>();
        set.add((long)0);
        int sum =0;
        for(int el : A){
            sum+=el;
            if(set.contains(sum)){
                return 1;
            }
            set.add((long)sum);
        }
        return 0;
    }
}
