package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Ninetales extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Ninetales";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.FIRE};
    }

    @Override
    public int getMaxHp() {
        return 73;
    }

    @Override
    public int getAttack() {
        return 76;
    }

    @Override
    public int getDefense() {
        return 75;
    }

    @Override
    public int getSpAtk() {
        return 81;
    }

    @Override
    public int getSpDef() {
        return 100;
    }

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.EMBER, MoveType.TAIL_WHIP, MoveType.ROAR, MoveType.QUICK_ATTACK,
                MoveType.CONFUSE_RAY, MoveType.SAFEGUARD, MoveType.INCINERATE, MoveType.FEINT_ATTACK,
                MoveType.HEX, MoveType.FLAME_BURST, MoveType.WILL_O_WISP, MoveType.PAYBACK,
                MoveType.FLAMETHROWER, MoveType.IMPRISON, MoveType.FIRE_BLAST, MoveType.GRUDGE,
                MoveType.CAPTIVATE, MoveType.INFERNO);
    }
}
