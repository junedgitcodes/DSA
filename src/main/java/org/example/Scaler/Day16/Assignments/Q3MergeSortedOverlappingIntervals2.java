package org.example.Scaler.Day16.Assignments;

import org.example.Scaler.Day16.Class.Interval;

import java.util.ArrayList;
import java.util.List;

public class Q3MergeSortedOverlappingIntervals2 {
    public static void main(String[] args) {

    }

    public static int[][] solve(int[][] A) {

        List<Interval> input = new ArrayList<>();
        for (int[] el : A) {
            input.add(new Interval(el[0], el[1]));
        }
        List<Interval> result = intervalCall(input);
        int[][] ans = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            Interval interval = result.get(i);
            ans[i][0] = interval.start;
            ans[i][1] = interval.end;
        }
        return ans;
    }

    public static List<Interval> intervalCall(List<Interval> A) {
        List<Interval> ans = new ArrayList<>();
        int a1 = A.get(0).start;
        int b1 = A.get(0).end;

        for (int i = 1; i < A.size(); i++) {
            int a2 = A.get(i).start;
            int b2 = A.get(i).end;
            if (b1 < a2) {
                Interval temp = new Interval(a1, b1);
                ans.add(temp);
                a1 = a2;
                b1 = b2;
            } else {
                b1 = Math.max(b1, b2);
            }
        }
        Interval temp = new Interval(a1, b1);
        ans.add(temp);
        return ans;
    }


}
