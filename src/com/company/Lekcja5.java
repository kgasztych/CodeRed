package com.company;

public class Lekcja5 {
    public static long[] fibonacci (int n) {
        long values[] = new long[n];
        values[0] = 0;
        values[1] = 1;
        //long a1 = 1;
        // long a2 = 1;

        //values[60]
        for (int i = 2; i < n; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }
        //long sum = a1 + a2;
        //a1 = a2;
        //a2 = sum;
        //System.out.println(i + ": " + sum);
        return values;
    }
    public static void main (String [] args) {
        int n = 60;
         long[] fibonaccivalues = fibonacci(n);



         for (int i = 0; i < n; i++){
            System.out.println(i + " : " + fibonaccivalues[i]);
        }
    }
}


