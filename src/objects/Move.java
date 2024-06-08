package objects;

import enums.MoveType;

public class Move {
    private MoveType moveType;
    private int pp;

    /**
     * Istanzia una nuova mossa
     *
     * @param moveType MoveType della mossa
     */
    public Move(MoveType moveType) {
        this.moveType = moveType;
        this.pp = moveType.getMaxPP();
    }

    /**
     * Ottieni il tipo di mossa
     *
     * @return Oggetto MoveType relativo alla mossa
     */
    public MoveType getMoveType() {
        return moveType;
    }

    /**
     * Ottieni i PP della mossa
     *
     * @return PP della mossa
     */
    public int getPP() {
        return pp;
    }

    /**
     * Imposta i PP della mossa
     *
     * @param pp PP da impostare
     */
    public void setPP(int pp) {
        this.pp = pp;
    }
}
