package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Umbreon extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Umbreon";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.DARK};
    }

    @Override
    public int getHp() {
        return 95;
    }

    @Override
    public int getAttack() {
        return 65;
    }

    @Override
    public int getDefense() {
        return 110;
    }

    @Override
    public int getSpAtk() {
        return 60;
    }

    @Override
    public int getSpDef() {
        return 130;
    }

    @Override
    public int getSpeed() {
        return 65;
    }

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of();
    }
}
