package com.company.heroes;

public class Beast {
    protected String name;
    protected int damage;
    protected  int HP;

    public Beast(String name, int damage, int HP) {
        this.name = name;
        this.damage = damage;
        this.HP = HP;
    }

    public final void damageBeast(Hero hero) {
        hero.HP -= this.damage;
        System.out.println("Damaged " + damage);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHP() {
        return HP;
    }
}
