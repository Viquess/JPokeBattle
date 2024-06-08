package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Bulbasaur extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Bulbasaur";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.GRASS, Type.POISON};
    }

    @Override
    public int getMaxHp() {
        return 45;
    }

    @Override
    public int getAttack() {
        return 49;
    }

    @Override
    public int getDefense() {
        return 49;
    }

    @Override
    public int getSpAtk() {
        return 65;
    }

    @Override
    public int getSpDef() {
        return 65;
    }

    @Override
    public int getSpeed() {
        return 45;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.GROWL, MoveType.TACKLE, MoveType.VINE_WHIP, MoveType.GROWTH,
                MoveType.LEECH_SEED, MoveType.RAZOR_LEAF, MoveType.POISON_POWDER, MoveType.SLEEP_POWDER,
                MoveType.TAKE_DOWN, MoveType.SWEET_SCENT, MoveType.SYNTHESIS, MoveType.WORRY_SEED,
                MoveType.DOUBLE_EDGE, MoveType.SOLAR_BEAM);
    }
}
