package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Raichu extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Raichu";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.ELECTRIC};
    }

    @Override
    public int getHp() {
        return 60;
    }

    @Override
    public int getAttack() {
        return 90;
    }

    @Override
    public int getDefense() {
        return 55;
    }

    @Override
    public int getSpAtk() {
        return 90;
    }

    @Override
    public int getSpDef() {
        return 80;
    }

    @Override
    public int getSpeed() {
        return 110;
    }

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of();
    }
}
