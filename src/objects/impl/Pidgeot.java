package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Pidgeot extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Pidgeot";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.NORMAL, Type.FLYING};
    }

    @Override
    public int getMaxHp() {
        return 83;
    }

    @Override
    public int getAttack() {
        return 80;
    }

    @Override
    public int getDefense() {
        return 75;
    }

    @Override
    public int getSpAtk() {
        return 70;
    }

    @Override
    public int getSpDef() {
        return 70;
    }

    @Override
    public int getSpeed() {
        return 101;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.TACKLE, MoveType.SAND_ATTACK, MoveType.GUST, MoveType.QUICK_ATTACK,
                MoveType.WHIRLWIND, MoveType.TWISTER, MoveType.FEATHER_DANCE, MoveType.AGILITY,
                MoveType.WING_ATTACK, MoveType.ROOST, MoveType.TAILWIND, MoveType.MIRROR_MOVE,
                MoveType.AIR_SLASH, MoveType.HURRICANE);
    }
}
