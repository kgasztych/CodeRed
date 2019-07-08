package com.homework.Dwa;

public class Cow {
    int weight = 500;
    int children = 0;
    int foodLevel = 0;
    int gold = 200;

    public int getMilk(){
        return  ((weight / 10) + (foodLevel) - children) * 10;
    }
}