package com.homework.Dwa;

import java.util.Random;

public abstract class FarmingField {
    int sowingCost = 100;
    int baseProfitAfterHarvest = 150;
    int droughtRisk;
    String name;

    public int calculateProfit() {
        Random random = new Random();
        droughtRisk = random.nextInt(100);
        if(droughtRisk > 20) {
            return 0;
        }
        return baseProfitAfterHarvest ;
    }

    @Override
    public String toString() {
        return name;
    }
}
