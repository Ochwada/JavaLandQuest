package com.codeland;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLand: The Code Chronicles!");

        int totalUnit = 95;
        System.out.println("\n--- Potion Calculator ---");
        System.out.println("Full Potions Made: " + PotionCalculator.fullPotionsMade(totalUnit));
        System.out.println("Leftover Units: " + PotionCalculator.leftOverUnits(totalUnit));
        System.out.println("Total Ingredients Cost: " + PotionCalculator.totalCostOfIngredients(totalUnit));


        System.out.println("\n--- Spell Cost Estimator ---");
        System.out.println(SpellCostEstimator.getSpellSummary("Genjustu", 6));
        System.out.println(SpellCostEstimator.getSpellSummary("Ninjutsu", 4));
        System.out.println(SpellCostEstimator.getSpellSummary("Taijutsu", 2));
        System.out.println(SpellCostEstimator.getSpellSummary("Wolf-Feng-Over-Feng", 2));
        System.out.println();


        // TODO: Start Hero Dashboard or individual module tests
    }
}
