package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Rapidash extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Rapidash";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.FIRE};
    }

    @Override
    public int getMaxHp() {
        return 65;
    }

    @Override
    public int getAttack() {
        return 100;
    }

    @Override
    public int getDefense() {
        return 70;
    }

    @Override
    public int getSpAtk() {
        return 80;
    }

    @Override
    public int getSpDef() {
        return 80;
    }

    @Override
    public int getSpeed() {
        return 105;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.QUICK_ATTACK, MoveType.GROWL, MoveType.TAIL_WHIP, MoveType.EMBER,
                MoveType.FLAME_WHEEL, MoveType.STOMP, MoveType.FLAME_CHARGE, MoveType.AGILITY,
                MoveType.FIRE_SPIN, MoveType.TAKE_DOWN, MoveType.INFERNO, MoveType.FIRE_BLAST,
                MoveType.BOUNCE, MoveType.FLARE_BLITZ);
    }
}
