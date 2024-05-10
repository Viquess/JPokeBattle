package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Bulbasaur extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Bulbasaur";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.GRASS, Types.POISON};
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

    @Override
    public List<MoveTypes> getLearnableMoves() {
        return List.of(MoveTypes.GROWL, MoveTypes.TACKLE);
    }
}
