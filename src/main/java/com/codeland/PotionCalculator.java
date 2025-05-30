package com.codeland;

public class PotionCalculator {

    private static final int UNITS_PER_POTION = 7;
    private static final double PRICE_PER_UNIT = 4.99;

    /**
     * Calculates the number of full potions that can be made with the given unit
     *
     * @param totalUnits : The number of ingredient units the wizard has.
     * @return The number of full positions.
     */

    public static int fullPotionsMade(int totalUnits) {
        return totalUnits / UNITS_PER_POTION;
    }

    /**
     * Calculates te number of leftover units after making the full potions.
     *
     * @param totalUnits : The number of ingredient units the wizard has
     * @return The number of leftover units after making the full potions
     */
    public static int leftOverUnits(int totalUnits) {
        return totalUnits % UNITS_PER_POTION;
    }

    /**
     * Calculates the total cost of ingredients in wizard coins
     *
     * @param totalUnits : The number of ingredient units the wizard has.
     * @return total cost of ingredients in wizard coins
     */

    public static double totalCostOfIngredients(int totalUnits) {
        return totalUnits * PRICE_PER_UNIT;
    }
}
