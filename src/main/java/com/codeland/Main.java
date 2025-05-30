package com.codeland;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLand: The Code Chronicles!");

        System.out.println("\n5.--- Day Scheduler ---");
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter Day Number: ");
        //int day = scanner.nextInt();
        int day = 4;
        System.out.println("Day "+ day + ": " + DayScheduler.dayActivities(day));


        System.out.println("\n4.--- Guild Gatekeeper ---");
        System.out.println("Knight -> " + GuildGatekeeper.determineAccess("Knight"));
        System.out.println("mage -> " + GuildGatekeeper.determineAccess("mage"));
        System.out.println("Me -> " + GuildGatekeeper.determineAccess("me"));
        System.out.println();


        /*System.out.println("\n3.--- Hero Eligibility Checker ---");
        int age = 20;
        int strength = 50;
        int experience = 55;

        boolean eligible = HeroEligibilityChecker.isEligibility(age, strength);
        String rank = HeroEligibilityChecker.getRank(experience);

        String rankAndEligibility = HeroEligibilityChecker.getRank(experience,age, strength);

        System.out.println("Eligibility: " + (eligible ? "✅ Eligible for the Guild" : "❌ Not eligible"));
        System.out.println("Rank: " + rank);
        System.out.println("Rank & Eligibility: " + rankAndEligibility);
        System.out.println();*/


        /* System.out.println("\n2.--- Spell Cost Estimator ---");
        System.out.println(SpellCostEstimator.getSpellSummary("Genjustu", 6));
        System.out.println(SpellCostEstimator.getSpellSummary("Ninjutsu", 4));
        System.out.println(SpellCostEstimator.getSpellSummary("Taijutsu", 2));
        System.out.println(SpellCostEstimator.getSpellSummary("Wolf-Feng-Over-Feng", 2));
        System.out.println();*/


        /*int totalUnit = 95;
        System.out.println("\n1.--- Potion Calculator ---");
        System.out.println("Full Potions Made: " + PotionCalculator.fullPotionsMade(totalUnit));
        System.out.println("Leftover Units: " + PotionCalculator.leftOverUnits(totalUnit));
        System.out.println("Total Ingredients Cost: " + PotionCalculator.totalCostOfIngredients(totalUnit));*/


        // TODO: Start Hero Dashboard or individual module tests
    }
}
