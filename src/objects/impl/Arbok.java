package objects.impl;

import enums.MoveTypes;
import enums.Types;
import objects.PokemonImpl;

import java.util.List;

public class Arbok extends PokemonImpl {
    @Override
    public String getDisplayName() {
        return "Arbok";
    }

    @Override
    public Types[] getTypes() {
        return new Types[]{Types.POISON};
    }

    @Override
    public int getHp() {
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
    public List<MoveTypes> getLearnableMoves() {
        return List.of(MoveTypes.BITE, MoveTypes.FIRE_FANG, MoveTypes.ICE_FANG, MoveTypes.LEER,
                MoveTypes.POISON_STING, MoveTypes.THUNDER_FANG, MoveTypes.WRAP, MoveTypes.GLARE,
                MoveTypes.SCREECH, MoveTypes.ACID, MoveTypes.SPIT_UP, MoveTypes.STOCKPILE,
                MoveTypes.SWALLOW, MoveTypes.ACID_SPRAY, MoveTypes.SLUDGE_BOMB, MoveTypes.GASTRO_ACID,
                MoveTypes.BELCH, MoveTypes.HAZE, MoveTypes.COIL, MoveTypes.GUNK_SHOT);
    }
}
