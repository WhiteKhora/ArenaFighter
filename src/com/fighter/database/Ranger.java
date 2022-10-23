package com.fighter.database;

import com.fighter.template.*;

public class Ranger  extends Fighter {

    public Ranger(String name) {
        this.name = name;
        this.type = "Ranger";

        this.critChance += 10;
    }
}
