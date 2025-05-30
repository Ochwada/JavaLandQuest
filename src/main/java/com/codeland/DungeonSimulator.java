package com.codeland;

import java.util.Random;
/**
 * DungeonSimulator - Demonstrates the use of loops in Java
 */
public class DungeonSimulator {

    public static void collectedGold() {

        // Used to simulate random gold and chest success
        Random random = new Random();

        // Tracks the total gold collected
        int goldAmount = 0;

        // Amount of gold found in each room
        int goldPerRoam;

        System.out.println("Collecting gold ...");

        // ---------------------------------
        // Loop 1: Collecting Gold till 100
        // ---------------------------------

        while (goldAmount < 100) {
            // generate random gold amount between 1 and 25 (instead of fixed amount)
            goldPerRoam = random.nextInt(25);

            goldAmount += goldPerRoam;

            System.out.println("Found " + goldPerRoam + " gold. Remaining gold to target: " + (100 - goldAmount));
        }

        System.out.println("Goal Reached! Total Gold: " + goldAmount + "\n");

        // ---------------------------------
        // Loop 2: Visit 5 Dungeon Room
        // ---------------------------------
        for (int room = 0; room <= 5; room++) {
            // Room exploration
            System.out.println("Room: " + room + ": Searching for treasure or traps...");
        }

        // ---------------------------------
        // Loop 3: Try to open a chest (max 3 tries)
        // ---------------------------------
        System.out.println("Trying to open a locked chest...");

        // Tracks the number of attempts to open the chest
        int attempt = 0;

        // Tracks whether the chest has been opened.
        boolean isOpened = false;

        do {
            attempt++;
            System.out.println("Attempt " + attempt + ": Trying to unlock the chest ...");

            if (attempt == 3) {
                isOpened = true;
            }
        } while (!isOpened && attempt < 3);


        if (isOpened) {
            System.out.println("Successfully Opened the Chest.");
        } else {
            System.out.println("Failed to open the chest After 3 Tries.");
        }

    }


}
