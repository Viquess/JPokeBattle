package objects.impl;

import enums.MoveType;
import enums.Type;
import objects.PokemonImpl;

import java.util.List;

public class Arbok extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Arbok";
    }

    @Override
    public Type[] getTypes() {
        return new Type[]{Type.POISON};
    }

    @Override
    public int getMaxHp() {
        return 60;
    }

    @Override
    public int getAttack() {
        return 95;
    }

    @Override
    public int getDefense() {
        return 69;
    }

    @Override
    public int getSpAtk() {
        return 65;
    }

    @Override
    public int getSpDef() {
        return 79;
    }

    @Override
    public int getSpeed() {
        return 80;
    }

    @Override
    public List<MoveType> getLearnableMoves() {
        return List.of(MoveType.BITE, MoveType.FIRE_FANG, MoveType.ICE_FANG, MoveType.LEER,
                MoveType.POISON_STING, MoveType.THUNDER_FANG, MoveType.WRAP, MoveType.GLARE,
                MoveType.SCREECH, MoveType.ACID, MoveType.SPIT_UP, MoveType.STOCKPILE,
                MoveType.SWALLOW, MoveType.ACID_SPRAY, MoveType.SLUDGE_BOMB, MoveType.GASTRO_ACID,
                MoveType.BELCH, MoveType.HAZE, MoveType.COIL, MoveType.GUNK_SHOT);
    }
}
