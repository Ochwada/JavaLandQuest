package com.codeland;

public class Goblin extends Creature {
    public Goblin(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(
                name + ": Fights with different Weapons"
        );
    }
}
