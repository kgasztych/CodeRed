package com.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lekcja8 {
    public static void main(String[] args) {

        int x;

        do {
            System.out.println("Please provide a number: ");
            //try {
                Scanner scanner = new Scanner(System.in);
                x = scanner.nextInt();
                //System.out.println("OK");
            //}
            //catch (InputMismatchException e){
                //System.out.println(e);
                //System.out.println("error");
               // continue;
            //}

            switch (x) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 4:
                    System.out.println("You've made it!!!");
                    break;
                default:
                    System.out.println("Other number");
                    break;
            }
        }
        while (x != 4);

    }
}
