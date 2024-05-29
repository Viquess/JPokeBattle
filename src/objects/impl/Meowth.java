package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Meowth extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Meowth";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.NORMAL};
    }

    @Override
    public int getHp() {
        return 40;
    }

    @Override
    public int getAttack() {
        return 45;
    }

    @Override
    public int getDefense() {
        return 35;
    }

    @Override
    public int getSpAtk() {
        return 40;
    }

    @Override
    public int getSpDef() {
        return 40;
    }

    @Override
    public int getSpeed() {
        return 90;
    }

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of();
    }
}
