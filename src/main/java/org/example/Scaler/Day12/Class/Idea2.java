package org.example.Scaler.Day12.Class;

public class Idea2 {
    public static void main(String[] args) {
        String str = "adaebcdfdcbetggte";
        int result = longestPalindromeSubString(str);
        System.out.println("result = " + result);
    }


    public static int longestPalindromeSubString(String str) {
        int N = str.length();
        int ans = 1;
        for (int c = 0; c < N; c++) {
//            c as the center
            int l, r;
            l = r = c;
            while (l >= 0 && r < N && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }
            ans = Math.max(ans, r - l - 1);
//            c and c++ as the center

            l = c;
            r = c + 1;
            while (l >= 0 && r < N && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }
            ans = Math.max(ans, r - l - 1);
        }
        return ans;
    }

}
