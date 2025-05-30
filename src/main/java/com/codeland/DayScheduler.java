package com.codeland;




/**
 * Story: Assign magical activities based on day of the week.
 *
 * Task:
 *
 * Use switch-case to return a string activity for a given day (1–7).
 * */
public class DayScheduler {

    /**
     * Returns a magical activity based on the day of the week.
     * @param day The day of the week ( day 1 to 7)
     * @return A dummy magical activity.
     * */
    public static String dayActivities(int day){
        switch (day){
            case 1 -> {return "Brew basic healing potions";}
            case 2 -> {return "Practice Fireball casting";}
            case 3 -> {return "Summon your sprit animal";}
            case 4 -> {return "Flying drill";}
            case 5 -> {return "Quest day";}
            case 6 -> {return "Weapon enchantment";}
            case 7 -> {return "Train with enchanted weapons";}
            default -> {return "Enter a valid day number (1-7)";}
        }
    }
}
