package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Squirtle extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Squirtle";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.WATER};
    }

    @Override
    public int getHp() {
        return 44;
    }

    @Override
    public int getAttack() {
        return 48;
    }

    @Override
    public int getDefense() {
        return 65;
    }

    @Override
    public int getSpAtk() {
        return 50;
    }

    @Override
    public int getSpDef() {
        return 64;
    }

    @Override
    public int getSpeed() {
        return 43;
    }

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of();
    }
}