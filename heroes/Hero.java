package com.company.heroes;

import com.company.Information;

public abstract class Hero implements Information {
    protected double HP;
    protected int lvl;
    protected double damage;

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

    @Override
    public void info() {
        System.out.println("HP: " + this.HP + "\nlvl: " + this.lvl);
    }
}
