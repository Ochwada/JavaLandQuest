package com.codeland;

public class Dragon extends Creature {

    public Dragon(String name) {
        super(name);
    }


    @Override
    public void attack() {
        System.out.println(
                name + ": Breaths fire!");
    }

}
