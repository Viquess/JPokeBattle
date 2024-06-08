package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Raichu extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Raichu";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.ELECTRIC};
    }

    @Override
    public int getMaxHp() {
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
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.THUNDER_SHOCK, MoveType.TAIL_WHIP, MoveType.QUICK_ATTACK, MoveType.DOUBLE_TEAM,
                MoveType.ELECTRO_BALL, MoveType.THUNDER_WAVE, MoveType.FEINT, MoveType.SPARK,
                MoveType.NUZZLE, MoveType.DISCHARGE, MoveType.SLAM, MoveType.THUNDERBOLT,
                MoveType.AGILITY, MoveType.WILD_CHARGE, MoveType.LIGHT_SCREEN, MoveType.THUNDER);
    }
}
