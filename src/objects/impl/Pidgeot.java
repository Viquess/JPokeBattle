package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Pidgeot extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Pidgeot";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.NORMAL, Types.FLYING};
    }

    @Override
    public int getHp() {
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
    public List<MoveTypes> getLearnableMoves() {
        return List.of(MoveTypes.TACKLE, MoveTypes.SAND_ATTACK, MoveTypes.GUST, MoveTypes.QUICK_ATTACK,
                MoveTypes.WHIRLWIND, MoveTypes.TWISTER, MoveTypes.FEATHER_DANCE, MoveTypes.AGILITY,
                MoveTypes.WING_ATTACK, MoveTypes.ROOST, MoveTypes.TAILWIND, MoveTypes.MIRROR_MOVE,
                MoveTypes.AIR_SLASH, MoveTypes.HURRICANE);
    }
}
