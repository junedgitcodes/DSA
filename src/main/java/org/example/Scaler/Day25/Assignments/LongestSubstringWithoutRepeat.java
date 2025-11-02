package org.example.Scaler.Day25.Assignments;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdefabc"));
    }

    public static int lengthOfLongestSubstring(String A) {
        int l = 0;
        int r = 0;
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        while (r < A.length()) {
            char curr = A.charAt(r);
            if (set.contains(curr)) {
                set.remove(A.charAt(l));
                l++;
            } else {
                set.add(curr);
                int len = r - l + 1;
                maxLen = Math.max(len, maxLen);
                r++;
            }
        }
        return maxLen;
    }
}
