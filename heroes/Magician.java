package com.company.heroes;

public abstract class Magician extends Hero {
    int magicDamage;

    public Magician(double HP, int lvl, double damage) {
        super(HP, lvl, damage);
        this.magicDamage = 2;
    }

    public Magician(double HP, int lvl, double damage, int magicDamage) {
        super(HP, lvl, damage);
        this.magicDamage = magicDamage;
    }

    void magicAttack() {}
}
