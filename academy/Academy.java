package com.company.academy;

import com.company.Trainee;

public class Academy {
    private double potential;

    public Academy() {
        this.potential = 100;
    }

    public void teach(Trainee trainee) {
        if (potential > 0) {
            this.potential -= trainee.train();
        }
    }

    public void showRemPot() { // Show Remaining Potential
        System.out.println("Remained potential = " + potential + "%");
    }

    public void upgradePotential() {
        this.potential = 100;
    }
}
