package com.company;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int price, sum = 0;
        int[] prices;
        prices = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Please provide price for Product: ");
            prices[i] = console.nextInt();
            sum = sum + prices[i];

        }
        double Avprice = sum / 5;
        System.out.println("Average price for a product is " + Avprice);
        System.out.println("Price1 " + prices[0]);
        System.out.println(sum);
        }
    }

