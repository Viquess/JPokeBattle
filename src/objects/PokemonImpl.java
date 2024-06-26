package objects;

import enums.MoveCategory;
import enums.MoveType;
import enums.Type;
import util.Datas;
import util.Utils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public abstract class PokemonImpl implements Pokemon {
    protected List<Move> moves = new ArrayList<>();
    protected double hp;

    @Override
    public abstract String getDisplayName();

    @Override
    public abstract Type[] getTypes();

    @Override
    public abstract int getMaxHp();

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
    public abstract List<MoveType> getLearnableMoves();

    @Override
    public String getId() {
        return getClass().getSimpleName().toLowerCase();
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public List<Move> getMoves() {
        return moves;
    }

    @Override
    public void addMove(Move move) {
        if (moves.size() < 4)
            moves.add(move);
    }

    @Override
    public boolean hasMove(MoveType type) {
        for (Move move : moves)
            if (move.getMoveType() == type)
                return true;

        return false;
    }

    @Override
    public ImageIcon getFrontSprite() {
        return new ImageIcon(Utils.getURL("files\\sprites\\front\\%s.png".formatted(getId())));
    }

    @Override
    public ImageIcon getBackSprite() {
        return new ImageIcon(Utils.getURL("files\\sprites\\back\\%s.png".formatted(getId())));
    }

    @Override
    public void cry() {
        Utils.playSound("files\\sounds\\cries\\%s.wav".formatted(getId()));
    }

    @Override
    public boolean isAvailable() {
        if ((int) getHp() == 0)
            return false;

        boolean hasMove = false;
        for (Move move : getMoves())
            if (move.getPP() > 0) {
                hasMove = true;
                break;
            }

        return hasMove;
    }

    @Override
    public void register() {
        Datas.getPokemons().put(getId(), this);
    }

    @Override
    public PokemonImpl newInstance() {
        try {
            PokemonImpl classe = getClass().getDeclaredConstructor().newInstance();
            classe.hp = getMaxHp();

            for (int i = 0; i < Math.min(4, classe.getLearnableMoves().size()); i++) {
                Move move = new Move(Utils.randOf(classe.getLearnableMoves()));
                while (classe.hasMove(move.getMoveType()) || move.getMoveType().getCategory() == MoveCategory.STATUS || move.getMoveType().getAccuracy() == 0)
                    move = new Move(Utils.randOf(classe.getLearnableMoves()));

                classe.addMove(move);
            }

            return classe;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
