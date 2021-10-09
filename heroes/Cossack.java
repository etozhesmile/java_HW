package com.company.heroes;

import com.company.Trainee;
import com.company.weapons.Saber;

public class Cossack extends Warrior implements Trainee {
    Saber saber;

    public Cossack(double HP, int lvl, double damage, double damageMultiplier, Saber saber) {
        super(HP, lvl, damage, damageMultiplier);
        this.saber = saber;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("I have a saber");
    }

    public void hitBySaber(Hero hero) {
        hero.HP -= saber.getDamage();
    }

    @Override
    public double train() {
        this.damage *= 1.05;
        return 0.5;
    }
}
