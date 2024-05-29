package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Ninetales extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Ninetales";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.FIRE};
    }

    @Override
    public int getHp() {
        return 73;
    }

    @Override
    public int getAttack() {
        return 76;
    }

    @Override
    public int getDefense() {
        return 75;
    }

    @Override
    public int getSpAtk() {
        return 81;
    }

    @Override
    public int getSpDef() {
        return 100;
    }

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of();
    }
}