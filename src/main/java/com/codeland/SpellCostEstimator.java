package com.codeland;

public class SpellCostEstimator {
    /**
     * Calculates the coast of a spell based oon its name and power level.
     * Different spells have different base multiplier based on exponential growth formula ( f(x) = base^(powerlevel)
     *
     * @param powerLevel : The power level of the spell
     * @param spellName  : The name of the spell
     * @return Total mana cost as an integer.
     */
    public static int calculateManaCost(String spellName, int powerLevel) {

        int base;
        switch (spellName.toLowerCase()) {
            case "genjustu":
                base = 3;
                break;
            case "ninjutsu":
                base = 2;
                break;
            case "taijutsu":
                base = 4;
                break;
            default:
                base = 1;

        }
        // Exponential growth formula ( f(x) = base^(powerlevel))
        int cost = 1;
        while (powerLevel > 0) {
            cost = cost * base;
            powerLevel--;
        }

        return cost;
    }

    /**
     * Returns a spell summary string.
     *
     * @param powerLevel : The power level of the spell
     * @param spellName  : The name of the spell
     * @return Summary string
     */
    public static String getSpellSummary(String spellName, int powerLevel) {
        int manaCost = calculateManaCost(spellName, powerLevel);

        return String.format(
                "Spell: %s | Power Level: %d | Mana Cost: %d",
                spellName,
                powerLevel,
                manaCost
        );
    }
}
