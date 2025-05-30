package com.codeland;

public abstract class Creature {
    protected String name;

    public Creature(String name) {
        this.name = name;
    }

    /**
     * Abstract method that each creature must implement.*/
    public abstract void attack();
}
