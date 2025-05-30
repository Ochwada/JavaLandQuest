package com.codeland;


import com.codeland.exceptions.BoxEmptyException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaLand: The Code Chronicles!");

        System.out.println("\n9.--- Magic Box ---");
        HeroDashboard.MagicBox<String> spellBox = new HeroDashboard.MagicBox<>();

        try {
            System.out.println("Try to open the box ...");
            System.out.println("Item: " + spellBox.get());
        } catch (BoxEmptyException e) {
            System.out.println(e.getMessage());
        }
        spellBox.set("Invisibility Cloak");
        spellBox.set("Sword Enchanter");

        try{
            System.out.println("\nTry again opening the box ...");
            System.out.println("Item: " + spellBox.get());
        }catch (BoxEmptyException e){
            System.out.println(e.getMessage());
        }

        /*
        System.out.println("\n8.--- Creature & Attacks ---");
        List<Creature> creatures = new ArrayList<>();
        creatures.add(new Goblin("Rigur"));
        creatures.add(new Goblin("Gobchi"));
        creatures.add(new Dragon("Gabiru"));
        creatures.add(new Wizard("Gelmud"));
        creatures.add(new Wizard("Treyni"));

        System.out.println("Creatures of Javaland - aaatttack!");
        for (Creature creature : creatures){
            creature.attack();
        }
        */

        /*
        System.out.println("\n7.--- Magic Inventory ---");
        // Item box
        MagicInventory.addItem("Sword");
        MagicInventory.addItem("Shield");
        MagicInventory.addItem("Potion");
        MagicInventory.displayItemList();
        // Potion box
        MagicInventory.addPotion("Mana");
        MagicInventory.addPotion("Healing");
        MagicInventory.addPotion("Strength");
        MagicInventory.displayPotionTypes();
        // Items & Quantity
        MagicInventory.addItemAndQuantity("Sword", 2);
        MagicInventory.addItemAndQuantity("Shield", 1);
        MagicInventory.addItemAndQuantity("Potion", 5);
        MagicInventory.displayItemAndQuantity();
        */

        /*
        System.out.println("\n6.--- Dungeon Simulator ---");
        DungeonSimulator.collectedGold();
        */

        /*
        System.out.println("\n5.--- Day Scheduler ---");
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter Day Number: ");
        //int day = scanner.nextInt();
        int day = 4;
        System.out.println("Day "+ day + ": " + DayScheduler.dayActivities(day));
        */

        /*
        System.out.println("\n4.--- Guild Gatekeeper ---");
        System.out.println("Knight -> " + GuildGatekeeper.determineAccess("Knight"));
        System.out.println("mage -> " + GuildGatekeeper.determineAccess("mage"));
        System.out.println("Me -> " + GuildGatekeeper.determineAccess("me"));
        System.out.println();
         */

        /*
        System.out.println("\n3.--- Hero Eligibility Checker ---");
        int age = 20;
        int strength = 50;
        int experience = 55;

        boolean eligible = HeroEligibilityChecker.isEligibility(age, strength);
        String rank = HeroEligibilityChecker.getRank(experience);

        String rankAndEligibility = HeroEligibilityChecker.getRank(experience,age, strength);

        System.out.println("Eligibility: " + (eligible ? "✅ Eligible for the Guild" : "❌ Not eligible"));
        System.out.println("Rank: " + rank);
        System.out.println("Rank & Eligibility: " + rankAndEligibility);
        System.out.println();
        */

        /*
        System.out.println("\n2.--- Spell Cost Estimator ---");
        System.out.println(SpellCostEstimator.getSpellSummary("Genjustu", 6));
        System.out.println(SpellCostEstimator.getSpellSummary("Ninjutsu", 4));
        System.out.println(SpellCostEstimator.getSpellSummary("Taijutsu", 2));
        System.out.println(SpellCostEstimator.getSpellSummary("Wolf-Feng-Over-Feng", 2));
        System.out.println();
        */


        /*
        int totalUnit = 95;
        System.out.println("\n1.--- Potion Calculator ---");
        System.out.println("Full Potions Made: " + PotionCalculator.fullPotionsMade(totalUnit));
        System.out.println("Leftover Units: " + PotionCalculator.leftOverUnits(totalUnit));
        System.out.println("Total Ingredients Cost: " + PotionCalculator.totalCostOfIngredients(totalUnit));
        */


        // TODO: Start Hero Dashboard or individual module tests
    }
}
