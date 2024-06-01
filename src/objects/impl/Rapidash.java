package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Rapidash extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Rapidash";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.FIRE};
    }

    @Override
    public int getHp() {
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
    public List<MoveTypes> getLearnableMoves() {
        return List.of(MoveTypes.QUICK_ATTACK, MoveTypes.GROWL, MoveTypes.TAIL_WHIP, MoveTypes.EMBER,
                MoveTypes.FLAME_WHEEL, MoveTypes.STOMP, MoveTypes.FLAME_CHARGE, MoveTypes.AGILITY,
                MoveTypes.FIRE_SPIN, MoveTypes.TAKE_DOWN, MoveTypes.INFERNO, MoveTypes.FIRE_BLAST,
                MoveTypes.BOUNCE, MoveTypes.FLARE_BLITZ);
    }
}
