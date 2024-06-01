package objects;

import enums.MoveTypes;
import enums.Types;
import util.Datas;
import util.Utils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class PokemonImpl implements Pokemon {
    private final String id = getClass().getSimpleName().toLowerCase();
    protected List<Move> moves = new ArrayList<>();

    public String getId() {
        return id;
    }

    public ImageIcon getFrontSprite() {
        return new ImageIcon(Utils.getURL("files\\sprites\\front\\%s.png".formatted(getId())));
    }

    public ImageIcon getBackSprite() {
        return new ImageIcon(Utils.getURL("files\\sprites\\back\\%s.png".formatted(getId())));
    }

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
        if (moves.size() > 4)
            moves.subList(0, 3);

        this.moves = moves;
    }

    public boolean addMove(Move move) {
        if (moves.size() < 4) {
            moves.add(move);
            return true;
        }

        return false;
    }

    @Override
    public void register() {
        Datas.getPokemons().put(id, this);
    }

    @Override
    public PokemonImpl newInstance(List<Move> moves) {
        try {
            PokemonImpl classe = getClass().getDeclaredConstructor().newInstance();
            moves.removeIf(move -> !classe.getLearnableMoves().contains(move.getMoveType()) || moves.indexOf(move) > 3);

            classe.setMoves(moves);
            return classe;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public PokemonImpl newInstance() {
        try {
            PokemonImpl classe = getClass().getDeclaredConstructor().newInstance();
            List<Move> moves = new ArrayList<>();
            for (int i = 0; i < Math.min(4, classe.getLearnableMoves().size()); i++) {
                Move move = new Move(Utils.randOf(classe.getLearnableMoves()));
                while (classe.hasMove(move.getMoveType()))
                    move = new Move(Utils.randOf(classe.getLearnableMoves()));

                classe.addMove(move);
            }

            return classe;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean hasMove(MoveTypes type) {
        for (Move move : moves)
            if (move.getMoveType() == type)
                return true;

        return false;
    }
}
