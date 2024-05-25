package objects;

import enums.MoveTypes;
import enums.Types;
import util.Datas;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public abstract class PokemonImpl implements Pokemon {
    private final String id = getClass().getSimpleName().toLowerCase();
    protected List<Move> moves = new ArrayList<>();

    @Override
    public abstract String getDisplayName();

    @Override
    public abstract Types[] getTypes();

    @Override
    public abstract int getHp();

    @Override
    public abstract int getAttack();

    @Override
    public abstract int getDefense();

    @Override
    public abstract int getSpAtk();

    @Override
    public abstract int getSpDef();

    @Override
    public abstract int getSpeed();

    @Override
    public abstract List<MoveTypes> getLearnableMoves();

    @Override
    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    @Override
    public void register() {
        Datas.getPokemons().put(id, this);
    }

    @Override
    public PokemonImpl newInstance(List<Move> moves) {
        try {
            PokemonImpl classe = getClass().getDeclaredConstructor().newInstance();
            moves.removeIf(move -> !classe.getLearnableMoves().contains(move.getType()));
            classe.setMoves(moves);

            return classe;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
