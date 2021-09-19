package com.company.weapons;

public class Sword {
    protected String name;
    protected int damage;

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
