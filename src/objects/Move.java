package objects;

import enums.MoveTypes;

public class Move {
    private MoveTypes moveType;
    private int pp;

    /**
     * Istanzia una nuova mossa
     *
     * @param moveType MoveType della mossa
     */
    public Move(MoveTypes moveType) {
        this.moveType = moveType;
        this.pp = moveType.getMaxPP();
    }

    /**
     * Ottieni il tipo di mossa
     *
     * @return Oggetto MoveType relativo alla mossa
     */
    public MoveTypes getMoveType() {
        return moveType;
    }

    /**
     * Ottieni i PP della mossa
     *
     * @return PP della mossa
     */
    public int getPp() {
        return pp;
    }
}
