package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Squirtle extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Squirtle";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.WATER};
    }

    @Override
    public int getMaxHp() {
        return 44;
    }

    @Override
    public int getAttack() {
        return 48;
    }

    @Override
    public int getDefense() {
        return 65;
    }

    @Override
    public int getSpAtk() {
        return 50;
    }

    @Override
    public int getSpDef() {
        return 64;
    }

    @Override
    public int getSpeed() {
        return 43;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.TACKLE, MoveType.TAIL_WHIP, MoveType.WATER_GUN, MoveType.WITHDRAW,
                MoveType.BUBBLE, MoveType.BITE, MoveType.RAPID_SPIN, MoveType.PROTECT,
                MoveType.WATER_PULSE, MoveType.AQUA_TAIL, MoveType.SKULL_BASH, MoveType.IRON_DEFENSE,
                MoveType.RAIN_DANCE, MoveType.HYDRO_PUMP);
    }
}
