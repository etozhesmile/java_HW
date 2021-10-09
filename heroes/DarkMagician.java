package com.company.heroes;

public class DarkMagician extends Magician{
    public DarkMagician(double HP, int lvl, double damage, int magicDamage) {
        super(HP, lvl, damage, magicDamage);
    }

    @Override
    public void magicAttack() {
        HP -= damage * magicDamage;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("magicDamage - " + magicDamage);
    }
}
