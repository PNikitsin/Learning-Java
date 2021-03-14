package com.company;

public class Tribe {
    private String name;
    private int number;
    private boolean familiarityWithFire;

    public Tribe(String name, int amount, boolean familiarityWithFire) {
        this.name = name;
        this.number = amount;
        this.familiarityWithFire = familiarityWithFire;
    }

    public Tribe() {
        this("", 0, false);
    }

    public Tribe(String name, int amount) {
        this(name, amount, false);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int amount) {
        this.number = amount;
    }

    public boolean getFamiliarityWithFire() {
        return familiarityWithFire;
    }

    public void setFamiliarityWithFire(boolean familiarityWithFire) {
        this.familiarityWithFire = familiarityWithFire;
    }

    @Override
    public String toString() {
        return name + ";" + number + ";" + familiarityWithFire + ";";
    }
}