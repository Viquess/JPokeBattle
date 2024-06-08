package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Charmander extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Charmander";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.FIRE};
    }

    @Override
    public int getMaxHp() {
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
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.GROWL, MoveType.SCRATCH, MoveType.EMBER, MoveType.SMOKESCREEN,
                MoveType.DRAGON_BREATH, MoveType.FIRE_FANG, MoveType.SLASH, MoveType.FLAMETHROWER,
                MoveType.SCARY_FACE, MoveType.FIRE_SPIN, MoveType.INFERNO, MoveType.FLARE_BLITZ);
    }
}
