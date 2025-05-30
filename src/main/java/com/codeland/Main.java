package com.codeland;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLand: The Code Chronicles!");

        System.out.println("\n--- Potion Calculator ---");
        System.out.println("Full Potions Made: " + PotionCalculator.fullPotionsMade(100));
        System.out.println("Leftover Units: " + PotionCalculator.leftOverUnits(100));
        PotionCalculator.totalCostOfIngredients(100);


        // TODO: Start Hero Dashboard or individual module tests
    }
}
