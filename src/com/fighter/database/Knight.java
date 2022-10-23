package com.fighter.database;

import com.fighter.template.*;

public class Knight extends Fighter {

    public Knight(String name) {
        this.name = name;
        this.type = "Knight";

        this.armor += 3;
    }
}
