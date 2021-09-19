package com.company.heroes;

import com.company.Trainee;

public class HealerDruid extends Healer implements Trainee {
    Beast beast;

    public HealerDruid(double HP, int lvl, double damage, int powerHeal) {
        super(HP, lvl, damage, powerHeal);
    }

    public void tameBeast(Beast beast) {
        this.beast = beast;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (beast != null) {
            System.out.println("Beast name: " + beast.getName() + ", HP: " + beast.getHP() + ", damage: " + damage);
        }
    }

    @Override
    public double train() {
        this.powerHeal *= 1.07;
        this.damage *= 1.01;
        return 0.8;
    }
}
