package com.codeland;

public class Wizard extends Creature {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(
                name + ": Attacks with Magic weapons"
        );
    }
}
