package org.example.Scaler.Day13.Assignments;

public class Q4SimpleReverse {
    public static void main(String[] args) {
        String A = "scaler";
        System.out.println("A = " + A);
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        int i =0;
        int j = A.length()-1;
        char[] chars = A.toCharArray();
        while(i<=j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
