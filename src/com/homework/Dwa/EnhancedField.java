package com.homework.Dwa;

import java.util.Random;

public class EnhancedField extends FarmingField {
    int enhancementMultiplier;
    @Override
    public int calculateProfit() {
        Random random = new Random();
        droughtRisk = random.nextInt(100);
        if(droughtRisk > 50) {
            return 0;
        }
        return baseProfitAfterHarvest * enhancementMultiplier;
    }
}
