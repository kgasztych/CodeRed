package com.homework.Dwa;

import java.util.Random;

public class StrawberryField extends FarmingField {
    int snailsRisk;
    @Override
    public int calculateProfit(){
        Random random = new Random();
        snailsRisk = random.nextInt(100);
        if(snailsRisk > 50) {
            return 0;
        }
        return baseProfitAfterHarvest * 2;
    }
}
