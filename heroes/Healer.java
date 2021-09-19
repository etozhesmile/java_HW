package com.company.heroes;

public class Healer extends Hero {
    protected int powerHeal;

    public Healer(double HP, int lvl, double damage, int powerHeal) {
        super(HP, lvl, damage);
        this.powerHeal = powerHeal;
    }

    public void heal() {
        HP += this.powerHeal;
    }

    public void heal(Hero hero) {
        hero.HP += this.powerHeal;
    }

    @Override
    public void printInfo() {
        System.out.println("HP: " + this.HP + "\nlvl: " + this.lvl);
        System.out.println("power of heal: " + powerHeal);
    }
}
