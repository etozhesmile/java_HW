package com.company.teachers;

import com.company.Trainee;
import com.company.heroes.Academy;
import com.company.heroes.HealerDruid;

public class PriestAcademy extends Academy {
    @Override
    public void teach(Trainee trainee) {
        if (trainee instanceof HealerDruid) {
            ((HealerDruid) trainee).setLvl(((HealerDruid) trainee).getLvl() + 1);
            super.teach(trainee);
        }
    }
}
