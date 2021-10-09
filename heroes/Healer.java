package com.company.heroes;

public abstract class Healer extends Hero {
    protected int powerHeal;

    public Healer(double HP, int lvl, double damage, int powerHeal) {
        super(HP, lvl, damage);
        this.powerHeal = powerHeal;
    }

    public void heal() {
        HP += this.powerHeal;
    }

    public void heal(Hero hero) {
        hero.HP += this.powerHeal * 1.5;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("power of heal: " + powerHeal);
    }
}
