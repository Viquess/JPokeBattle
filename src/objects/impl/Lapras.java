package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Lapras extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Lapras";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.WATER, Types.ICE};
    }

    @Override
    public int getHp() {
        return 130;
    }

    @Override
    public int getAttack() {
        return 85;
    }

    @Override
    public int getDefense() {
        return 80;
    }

    @Override
    public int getSpAtk() {
        return 85;
    }

    @Override
    public int getSpDef() {
        return 95;
    }

    @Override
    public int getSpeed() {
        return 60;
    }

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of();
    }
}
