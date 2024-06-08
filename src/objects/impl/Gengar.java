package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Gengar extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Gengar";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.GHOST, Type.POISON};
    }

    @Override
    public int getMaxHp() {
        return 60;
    }

    @Override
    public int getAttack() {
        return 65;
    }

    @Override
    public int getDefense() {
        return 60;
    }

    @Override
    public int getSpAtk() {
        return 130;
    }

    @Override
    public int getSpDef() {
        return 75;
    }

    @Override
    public int getSpeed() {
        return 110;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.LICK, MoveType.HYPNOSIS, MoveType.SPITE, MoveType.MEAN_LOOK,
                MoveType.CURSE, MoveType.NIGHT_SHADE, MoveType.CONFUSE_RAY, MoveType.SUCKER_PUNCH,
                MoveType.PAYBACK, MoveType.SHADOW_BALL, MoveType.DARK_PULSE, MoveType.DESTINY_BOND,
                MoveType.HEX, MoveType.DREAM_EATER);
    }
}
