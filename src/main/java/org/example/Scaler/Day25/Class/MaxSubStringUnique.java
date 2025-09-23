package org.example.Scaler.Day25.Class;

import java.util.HashSet;
import java.util.Set;

public class MaxSubStringUnique {
    public static void main(String[] args) {
        System.out.println(solve("abcabcbb"));
    }

    public static int solve(String str) {
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();
        int maxLen = 0;

        while (r < str.length()) {
            char current = str.charAt(r);
            if (set.contains(current)) {
                set.remove(str.charAt(l));
                l++;
            } else {
                set.add(current);
                int len = r - l + 1;
                maxLen = Math.max(maxLen, len);
                r++;
            }
        }
        return maxLen;
    }
}
