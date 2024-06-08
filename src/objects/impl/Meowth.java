package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Meowth extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Meowth";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.NORMAL};
    }

    @Override
    public int getMaxHp() {
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
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.SCRATCH, MoveType.GROWL, MoveType.BITE, MoveType.FAKE_OUT,
                MoveType.FURY_SWIPES, MoveType.SCREECH, MoveType.FEINT_ATTACK, MoveType.TAUNT,
                MoveType.PAY_DAY, MoveType.SLASH, MoveType.NASTY_PLOT, MoveType.ASSURANCE,
                MoveType.CAPTIVATE, MoveType.NIGHT_SLASH, MoveType.FEINT);
    }
}
