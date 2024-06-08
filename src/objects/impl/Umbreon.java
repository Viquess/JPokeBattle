package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Umbreon extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Umbreon";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.DARK};
    }

    @Override
    public int getMaxHp() {
        return 95;
    }

    @Override
    public int getAttack() {
        return 65;
    }

    @Override
    public int getDefense() {
        return 110;
    }

    @Override
    public int getSpAtk() {
        return 60;
    }

    @Override
    public int getSpDef() {
        return 130;
    }

    @Override
    public int getSpeed() {
        return 65;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.TACKLE, MoveType.TAIL_WHIP, MoveType.HELPING_HAND, MoveType.SAND_ATTACK,
                MoveType.PURSUIT, MoveType.QUICK_ATTACK, MoveType.CONFUSE_RAY, MoveType.FEINT_ATTACK,
                MoveType.ASSURANCE, MoveType.SCREECH, MoveType.MOONLIGHT, MoveType.MEAN_LOOK, MoveType.LAST_RESORT);
    }
}
