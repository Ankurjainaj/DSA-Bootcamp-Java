package com.Ankur.Exercism;

abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getSimpleName();
    }

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {
    boolean prepareSpell = false;

    @Override
    boolean isVulnerable() {
        return prepareSpell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return prepareSpell ? 12 : 3;
    }

    void prepareSpell() {
        prepareSpell = true;
    }
}

