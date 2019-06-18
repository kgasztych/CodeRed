package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello world!!!");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //int x=102; int y=203
        int x=102;
        int y=203;
        System.out.println(x+y);
        System.out.println(countLetters("Object"));

    }
    public static int countLetters(String x){

        return x.length();
    }
}

