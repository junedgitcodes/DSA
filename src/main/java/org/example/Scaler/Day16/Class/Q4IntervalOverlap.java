package org.example.Scaler.Day16.Class;

import java.util.ArrayList;
import java.util.List;

public class Q4IntervalOverlap {
    public static void main(String[] args) {
        List<Interval> interval = new ArrayList<>();
        interval.add(new Interval(0, 2));
        interval.add(new Interval(1, 4));
        interval.add(new Interval(5, 6));
        interval.add(new Interval(6, 8));
        interval.add(new Interval(7, 10));
        interval.add(new Interval(8, 9));
        interval.add(new Interval(12, 14));
        List<Interval> result = solve(interval);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).start + " " + result.get(i).end);
            System.out.println();
        }
    }

    public static List<Interval> solve(List<Interval> A) {
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
                a1 = Math.min(a1, a2);
                b1 = Math.max(b1, b2);
            }
        }
        Interval temp = new Interval(a1, b1);
        ans.add(temp);
        return ans;
    }

}
