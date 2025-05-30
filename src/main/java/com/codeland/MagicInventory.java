package com.codeland;

import java.util.*;

/**
 * MagicInventory - Demonstrates Java Collections
 */

public class MagicInventory {
    // List to store hero's items (Allows duplicates and preserves insertion order)
    public static List<String> items = new ArrayList<>();

    // Set to store Potions (unique potion types)
    public static Set<String> potionTypes = new HashSet<>();

    //Maps for items and quantity storage (item name -> quantity)
    public static Map<String, Integer> itemQuantities = new HashMap<>();


    // ---------------------------------------------------
    // List to Store Item Names.
    // ---------------------------------------------------

    /**
     * Adds an item to hero's inventory
     *
     * @param item The name of the item to be added.
     */
    public static void addItem(String item) {
        items.add(item);
    }

    /**
     * Display a list of Items in the hero's Item box
     */
    public static void displayItemList() {

        System.out.println("*** Hero's Item Box ***");

        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
        /*for (String  item: items){
            System.out.println("- " + item);
        }*/
        System.out.println();
    }

    // ---------------------------------------------------
    // Track Unique Potion Types.
    // ---------------------------------------------------

    /**
     * Add potions (depending on type) in the Item box.
     *
     * @param potionType The type of potion to add to the
     */

    public static void addPotion(String potionType) {
        potionTypes.add(potionType);
    }

    /**
     * Display a list of Items in the hero's Item box
     */
    public static void displayPotionTypes() {
        System.out.println("*** Potions Available ***");
        for (String potion : potionTypes) {
            System.out.println("- " + potion);
        }

        System.out.println();
    }
    // ---------------------------------------------------
    // Demonstrate use of Map to store item quantities
    // ---------------------------------------------------

    /**
     * Add Items and it's quantity to the map
     *
     * @param item     The item to be added.
     * @param quantity The count of the {@code item} in the map
     */
    public static void addItemAndQuantity(String item, int quantity) {
        itemQuantities.put(item, quantity);
    }

    /**
     * Display a list of items and its count
     */
    public static void displayItemAndQuantity() {
        System.out.println("*** Items and its Count ***");

        for (Map.Entry<String, Integer> entry : itemQuantities.entrySet()) {
            System.out.println("- " + entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
