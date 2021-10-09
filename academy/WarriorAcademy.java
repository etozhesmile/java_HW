package com.company.academy;

import com.company.Trainee;
import com.company.heroes.Warrior;

public class WarriorAcademy extends Academy {
    @Override
    public void teach(Trainee trainee) {
        if (trainee instanceof Warrior) {
            super.teach(trainee);
        }
    }
}
