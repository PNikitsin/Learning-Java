package com.company;
import java.io.Serializable;
import java.util.Scanner;

public class Tribe implements Serializable {
    private String name;
    private int number;
    private boolean familiarityWithFire;

    public Tribe(String name, int number, boolean familiarityWithFire) {
        this.name = name;
        this.number = number;
        this.familiarityWithFire = familiarityWithFire;
    }

    public Tribe(String name, int number) {
        this.name = name;
        this.number = number;
        this.familiarityWithFire = false;
    }

    public Tribe() {
        this.name = "";
        this.number = 0;
        this.familiarityWithFire = false;
    }

    public Tribe(Scanner scanner) {
        this(scanner.next(), scanner.nextInt(), scanner.nextBoolean());
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

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean familiarityWithFire() {
        return familiarityWithFire;
    }

    public void familiarityWithFire(boolean familiarityWithFire) {
        this.familiarityWithFire = familiarityWithFire;
    }

    @Override
    public String toString() {
        return name + ";" + number + ";" + familiarityWithFire;
    }
}