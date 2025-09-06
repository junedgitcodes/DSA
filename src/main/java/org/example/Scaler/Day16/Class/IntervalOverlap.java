package org.example.Scaler.Day16.Class;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalOverlap {
    public static void main(String[] args) {

        List<Interval> interval = Arrays.asList((new Interval(0, 2)), new Interval(1, 4), new Interval(5, 6), new Interval(6, 8),
                new Interval(7, 10), new Interval(8, 9), new Interval(12, 14));

        List<Interval> result = solution(interval);
        result.forEach(a -> System.out.println(a.start + " " + a.end));

    }

    public static List<Interval> solution(List<Interval> intervals) {
        List<Interval> ans = new ArrayList<>();
        int a1, a2, b1, b2;
        a1 = intervals.get(0).start;
        b1 = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); i++) {
            a2 = intervals.get(i).start;
            b2 = intervals.get(i).end;
            if (a2 > b1) {   // non-overlapping
                Interval temp = new Interval(a1, b1);
                ans.add(temp);
                a1 = a2;
                b1 = b2;
            } else { //overlapping
                b1 = Math.max(b1, b2);
            }
        }

        Interval temp = new Interval(a1, b1);
        ans.add(temp);
        return ans;
    }
}


class Interval {

    int start;
    int end;

    public Interval(int s, int e) {
        this.start = s;
        this.end = e;
    }
}
