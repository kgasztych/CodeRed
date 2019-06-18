package com.company;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String item_1 = "shoes";
        String item_2 = "boots";
        int price_1 = 10;
        int price_2 = 12;
        int quantity_1 = 3;
        int quantity_2 = 5;
        int total_1 = price_1 * quantity_1;
        int total_2 = price_2 * quantity_2;
        int all_items = total_1 + total_2;
        System.out.println(item_1 + ": " + total_1);
        System.out.println(item_2 + ": " + total_2);
        System.out.println("All: " + all_items);

        System.out.println("What is the coupon value?");
        int coupon_1 = console.nextInt();
        int coupon_2 = console.nextInt();
        if(coupon_1 == 0) {
            System.out.println("Incorrect discount");
            System.exit(1);
        }
        int price_1_c = price_1 - (price_1 * coupon_1 /100);
        System.out.println(price_1_c);
        double price_2_c = price_2 - (price_2 * coupon_2 /100.0);
        System.out.println(price_2_c);
        double all_w_cpn = (price_1_c * quantity_1) + (price_2_c *quantity_2);
        System.out.println("All with Coupon: " + all_w_cpn);





    }
}
