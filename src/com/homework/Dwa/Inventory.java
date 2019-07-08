package com.homework.Dwa;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Inventory {

    int money;


    ArrayList<FarmingField> fields = new ArrayList<>();
    ArrayList<Cow> cows = new ArrayList<>();

    public Inventory(){
        money = 1000;
    }

    public String toString(){

        return "My Inventory is now: " + money ;
    }

    public void buyStrawberryField(){

        FarmingField field = new StrawberryField();
        fields.add(field);
        money = money - field.sowingCost;
        System.out.println("Strawberries bought by: " + field.sowingCost);
    }
    public void buyBlueBerryField(){

        FarmingField field = new BlueBerryField();
        fields.add(field);
        money = money - field.sowingCost;
        System.out.println("Blueberries bought by: " + field.sowingCost);
    }
    public void buyEnhancedField(){

        FarmingField field = new EnhancedField();
        fields.add(field);
        money = money - field.sowingCost;
        System.out.println("Superberries bought by: " + field.sowingCost);

    }
    public void buyCow() {

        Cow cow = new Cow();
        cows.add(cow);
        money = money - cow.gold;
        System.out.println("New Cow bought by: " + cow.gold);
    }

    public void nextTurn() {
        System.out.println("Next turn!");
        for (FarmingField f: fields){
            money = money + f.calculateProfit();
            System.out.println("User has now : " + f.getClass() + " " + money);
        }
    }
}
