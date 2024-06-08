package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Lapras extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Lapras";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.WATER, Type.ICE};
    }

    @Override
    public int getMaxHp() {
        return 130;
    }

    @Override
    public int getAttack() {
        return 85;
    }

    @Override
    public int getDefense() {
        return 80;
    }

    @Override
    public int getSpAtk() {
        return 85;
    }

    @Override
    public int getSpDef() {
        return 95;
    }

    @Override
    public int getSpeed() {
        return 60;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.GROWL, MoveType.WATER_GUN, MoveType.SING, MoveType.MIST,
                MoveType.LIFE_DEW, MoveType.ICE_SHARD, MoveType.CONFUSE_RAY, MoveType.WATER_PULSE,
                MoveType.ICE_BEAM, MoveType.BODY_SLAM, MoveType.RAIN_DANCE, MoveType.PERISH_SONG,
                MoveType.BRINE, MoveType.SAFEGUARD, MoveType.HYDRO_PUMP, MoveType.BLIZZARD, MoveType.SHEER_COLD);
    }
}
