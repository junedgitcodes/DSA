package org.example.Scaler.Day21.Class;

public class PrintNoInDesc {
    public static void main(String[] args) {
            printNumber(9);
            System.out.println();
    }

    public static void printNumber(int A) {
        if(A==0){
            return;
        }
        printNumber(A-1);
        System.out.print(A+" ");
    }
}
