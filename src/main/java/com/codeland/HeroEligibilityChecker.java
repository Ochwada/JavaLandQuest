package com.codeland;

public class HeroEligibilityChecker {


    private static final int MIN_AGE = 18;
    private static final int MIN_STRENGTH = 70;

    /**
     * Eligibility validate method
     * Only heroes older than 18 and stronger than 70 can join the Guild.
     *
     * @param age      : age of the guild candidate.
     * @param strength : strength of the guild candidate.
     */
    public static boolean isEligibility(int age, int strength) {
        // Must be older than 18 and stronger than 70 can join the Guild
        return (age > MIN_AGE && strength > MIN_STRENGTH);
    }

    /**
     * Returns the hero rank based on experience.
     *
     * @param experience : Hero`s experience level
     * @return "Warrior" if experience is equal or more than 80 points, otherwise "Apprentice"
     */
    public static String getRank(int experience) {

        return (experience >= 80) ? "Warrior" : "Apprentice";

    }

    public static String getRank(int experience, int age, int strength){
        String rank =  (experience >= 80) ? "Warrior" : "Apprentice";
        boolean eligibility = isEligibility(age, strength);

        String note = eligibility ? "Eligible for Guild" : "Not Eligible for Guild";

        return String.format("%s (%s)", rank, note);
    }

}
