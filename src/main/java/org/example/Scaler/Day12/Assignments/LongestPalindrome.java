package org.example.Scaler.Day12.Assignments;

public class LongestPalindrome {

    public static void main(String[] args) {
        String str = "adaebcdfdcbetggte";
        int result = solution(str);
        System.out.println("result = " + result);
    }

    public static int solution(String A) {
        int ans = 1;
        int l, r;
        for (int c = 0; c < A.length(); c++) {
            //c i sthe center
            l = r = c;
            while (l >= 0 && r < A.length() && A.charAt(l) == A.charAt(r)) {
                l--;
                r++;
            }
            ans = Math.max(ans, r - l - 1);
            // c+1 as the ceneter
            l = c;
            r = c + 1;
            while (l >= 0 && r < A.length() && A.charAt(l) == A.charAt(r)) {
                l--;
                r++;
            }
            ans = Math.max(ans, r - l - 1);
        }
        return ans;
    }
}
