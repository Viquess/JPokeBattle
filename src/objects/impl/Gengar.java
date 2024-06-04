package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Gengar extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Gengar";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.GHOST, Types.POISON};
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
    public List<MoveTypes> getLearnableMoves() {
        return List.of(MoveTypes.LICK, MoveTypes.HYPNOSIS, MoveTypes.SPITE, MoveTypes.MEAN_LOOK,
                MoveTypes.CURSE, MoveTypes.NIGHT_SHADE, MoveTypes.CONFUSE_RAY, MoveTypes.SUCKER_PUNCH,
                MoveTypes.PAYBACK, MoveTypes.SHADOW_BALL, MoveTypes.DARK_PULSE, MoveTypes.DESTINY_BOND,
                MoveTypes.HEX, MoveTypes.DREAM_EATER);
    }
}
