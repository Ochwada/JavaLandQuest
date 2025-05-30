package com.codeland;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLand: The Code Chronicles!");

        int totalUnit = 95;
        System.out.println("\n--- Potion Calculator ---");
        System.out.println("Full Potions Made: " + PotionCalculator.fullPotionsMade(totalUnit));
        System.out.println("Leftover Units: " + PotionCalculator.leftOverUnits(totalUnit));
        System.out.println("Total Ingredients Cost: " + PotionCalculator.totalCostOfIngredients(totalUnit));


        // TODO: Start Hero Dashboard or individual module tests
    }
}
