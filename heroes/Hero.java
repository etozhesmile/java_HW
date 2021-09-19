package com.company.heroes;

public abstract class Hero {
    protected double HP;
    protected int lvl;
    protected double damage;

    public abstract void printInfo();

    public Hero(double HP, int lvl, double damage) {
        this.HP = HP;
        this.lvl = lvl;
        this.damage = damage;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public double getHP() {
        return HP;
    }

    public double getDamage() {
        return damage;
    }
}
