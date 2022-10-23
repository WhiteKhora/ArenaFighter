package com.fighter.database;

import com.fighter.template.*;
public class Assassin extends Fighter {

    public Assassin(String name) {
        this.name = name;
        this.type = "Assassin";

        this.health -= 20;
        this.damage += 5;
        this.critDamage += 25;
    }
}
