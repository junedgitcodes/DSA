package org.example.Scaler.Day13.practice;

public class Practice {
    public static void main(String[] args) {
        String A = "My name is Sumit";
        System.out.println(solve(A));
    }

    public static String solve(String A) {
        A = A.trim();
        String[] words = A.split(" ");
        StringBuilder st = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            st.append(words[i]);
            if (i > 0) {
                st.append(" ");
            }
        }
        return st.toString();
    }
}
