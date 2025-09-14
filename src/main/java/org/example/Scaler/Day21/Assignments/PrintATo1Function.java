package org.example.Scaler.Day21.Assignments;

public class PrintATo1Function {
    public static void main(String[] args) {

    }

    public static void solve(int A) {

    }

    public static void printNumbers(int start, int end) {
            if(start > end) {
                return;
            }
            System.out.print(start + " ");
            printNumbers(start + 1, end);
    }
}
