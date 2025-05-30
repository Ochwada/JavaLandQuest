package com.codeland;

public class GuildGatekeeper {

    /**
     * Determine access rights for different hero types
     *
     * @param heroType The type of hero.
     * @return The area the hero can access.
     */
    public static String determineAccess(String heroType) {
        String knight = "Knight";
        String mage = "Mage";

        if (heroType.equalsIgnoreCase(knight)) {
            return "Armory";
        } else if (heroType.equalsIgnoreCase(mage)) {
            return "Library";
        } else {
            return "Restricted";
        }
    }
}
