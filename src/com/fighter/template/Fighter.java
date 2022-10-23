package com.fighter.template;

import com.fighter.database.*;

public abstract class Fighter {
    protected String name;
    protected String type;
    protected int health;
    protected int damage;
    protected int armor;
    protected int critChance;
    protected int critDamage;

    public Fighter() {
        this.health = 100;
        this.damage = 5;
        this.armor = 2;
        this.critChance = 5;
        this.critDamage = 50;
    }

    public static Fighter createFighter(String name, String type) {
        Fighter fighter;

        if (type.equalsIgnoreCase("assassin")) {
            fighter = new Assassin(name);
        } else if (type.equalsIgnoreCase("knight")) {
            fighter = new Knight(name);
        } else if (type.equalsIgnoreCase("berserker")) {
            fighter = new Berserker(name);
        } else if (type.equalsIgnoreCase("ranger")) {
            fighter = new Ranger(name);
        } else {
            throw new IllegalArgumentException("Unknown type");
        }
        return fighter;
    }

    public String printPrimitiveOverview() {
        return (this.name + " (" + this.type + ")");
    }

    public void printOverview() {
        System.out.println("\nStats from: " + printPrimitiveOverview());
        System.out.println("Health: " + this.health);
        System.out.println("Damage: " + this.damage);
        System.out.println("Armor: " + this.armor);
        System.out.println("CritChance: " + this.critChance);
        System.out.println("CritDamage: " + this.critDamage);

    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; };



}
