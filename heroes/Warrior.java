package com.company.heroes;

public class Warrior extends Hero {
    protected double damageMultiplier;

    public Warrior(double HP, int lvl, double damage, double damageMultiplier) {
        super(HP, lvl, damage);
        this.damageMultiplier = damageMultiplier;
    }
    public void hit(Hero hero) {
        double damage = this.damageMultiplier * this.damage;
        hero.HP -= damage;
        System.out.println("Damaged " + damage);
    }


    @Override
    public void printInfo() {
        System.out.println("HP: " + this.HP + "\nlvl: " + this.lvl);
    }
}
