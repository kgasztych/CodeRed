package com.homework.Dwa;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class ProgramFarmer {
    public static void main(String[] args) {

        printUserMenu();

        Inventory a = new Inventory();
        System.out.println(a);
        RandomEvent yourTurn = new RandomEvent();
        Inventory inventory = new Inventory();

        int option;

        do {
            System.out.println("Please provide an option: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("Please provide an option from 1-6: ");
                    break;
                case 1:
                    inventory.buyBlueBerryField();
                    //System.out.println("Money BB=  " + inventory.money);
                    break;
                case 2:
                    inventory.buyStrawberryField();
                    //System.out.println("Money STRB=  " + inventory.money);
                    break;
                case 3:
                    inventory.buyEnhancedField();
                    //System.out.println("Money SB=  " + inventory.money);
                    break;
                case 4:
                    System.out.println(inventory);
                    break;
                case 5:
                    yourTurn.applyLuck(inventory);
                    break;
                    //System.out.println("Money =  " + inventory.money);
                default:
                    System.out.println("Bye Bye");
                    break;
            }

        //Scanner liczbaPol = new Scanner(System.in);


        //System.out.println("Please provide how many fields to buy: ")
            // int liczPola = liczbaPol.nextInt();
        //for (int i = 0; i < liczPola; i++) {
            //if (inventory.money <= 0) {
               // System.out.println("You don't have enough money to buy the field");
                //return;
            }
        while (option != 6);

            //inventory.buyBlueBerryField();
            //System.out.println("Money BB=  " + inventory.money);
    }

    static void printUserMenu(){

        String[] options = new String[] {"I'm in", "Buy Blueberries field", "Buy Strawberry Field", "Buy Enhanced Field",
                "Show inventory", "Next turn","Exit Game"};

        System.out.println("Welcome to my game ");
        for (int i =0 ;i<options.length;i++) {
            System.out.println(i + " - " + options[i]);
        }

            }
}



        //StrawberryField strawberries = new StrawberryField();
//        strawberries.name = "strawyberry";
        //strawberries.sowingCost = 20;
//        strawberries.baseProfitAfterHarvest = 25;
//
        // StrawberryField wildberries = new StrawberryField();
//        wildberries.name = "wildberries";
//        wildberries.sowingCost = 13;
//        wildberries.baseProfitAfterHarvest = 27;
//
//        EnhancedField popcorn = new EnhancedField();
//        popcorn.name = "popcorn";
//        popcorn.sowingCost = 9;
//        popcorn.baseProfitAfterHarvest = 20;
//
//        BlueBerryField blueBerryField = new BlueBerryField();
//        blueBerryField.name = "blueberry";
//
//        FarmingField[] farma = {strawberries, wildberries, popcorn, blueBerryField};
//
//        int sum = 0;
//        for (FarmingField a : farma) {
//            int fieldProfit = a.calculateProfit();
//            System.out.println("Profit for " + a + " " + fieldProfit);
//            sum = sum + fieldProfit;
//        }
//
//        System.out.println("Profit from all fields = " + sum);


