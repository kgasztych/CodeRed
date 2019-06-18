package com.homework.Dwa;

import java.util.Random;
import java.util.Scanner;

public class RandomEvent {

    int lotteryPrize = 1000;
    int miceCleanupCost = 200;


    public void applyLuck(Inventory inventory) {

        int ticket = new Random().nextInt(5);

        Inventory lottery = new Inventory();

        do {

            switch (ticket) {
                case 0:
                    System.out.println("try again ");
                    break;
                case 1:
                    System.out.println("You won won lotteryPrize ");
                    inventory.money = inventory.money + lotteryPrize;
                    break;
                case 2:
                    System.out.println("You loose - Mice infested the granary  ");
                    inventory.money = inventory.money - miceCleanupCost;
                    break;
                case 3:
                    System.out.println("You have inherited a field from a relative ");
                    inventory.buyEnhancedField();
                    break;
                case 4:
                    System.out.println(inventory);
                    break;
                default:
                    System.out.println("Bye Bye");
                    break;
            }

        } while (ticket != 5);
    }

    /*
    FarmingField field = new StrawberryField();
    fields.add(field);
      money = money - field.sowingCost;
     System.out.println("Strawberries bought by: " + field.sowingCost);
    */
}
