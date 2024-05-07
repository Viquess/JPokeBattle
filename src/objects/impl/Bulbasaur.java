package objects.impl;

import objects.PokemonImpl;

public class Bulbasaur extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Bulbasaur";
    }

    @Override
    public int getHp() {
        return 45;
    }

    @Override
    public int getAttack() {
        return 49;
    }

    @Override
    public int getDefense() {
        return 49;
    }

    @Override
    public int getSpAtk() {
        return 65;
    }

    @Override
    public int getSpDef() {
        return 65;
    }

    @Override
    public int getSpeed() {
        return 45;
    }
}
