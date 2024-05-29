package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Charmander extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Charmander";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.FIRE};
    }

    @Override
    public int getHp() {
        return 39;
    }

    @Override
    public int getAttack() {
        return 52;
    }

    @Override
    public int getDefense() {
        return 43;
    }

    @Override
    public int getSpAtk() {
        return 60;
    }

    @Override
    public int getSpDef() {
        return 50;
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
