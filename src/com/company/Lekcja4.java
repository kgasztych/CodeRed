package com.company;

import java.util.Random;

public class Lekcja4 {

    public static void main(String[] args) {
        //int a = 5;
        //horizontalline(a);
        //verticalline(a - 2);
        //horizontalline(a);

        int position = 100;
        int wall = new Random().nextInt(500);
            //if (position > wall){
            //System.out.println(position + ": " + wall + ": Race finished");
            //else {
            //System.out.println(position + ": " + wall + ": Still riding");

        while (position < wall) {
            System.out.println(position + ": " + wall + ": Still riding");
            wall = new Random().nextInt(1000);
        }
        System.out.println("Race finished");





    }


    public static void horizontalline(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("-");

        }
        System.out.println();
    }

    public static void verticalline(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("|");
            for (int j = 0; j < a; j++){
                System.out.print(" ");
            }
            System.out.println("|");

        }
    }
}