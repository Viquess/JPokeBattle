package objects;

import enums.MoveTypes;

public class Move {
    private MoveTypes type;
    private int pp;

    public Move(MoveTypes type, int pp) {
        this.type = type;
        this.pp = pp;
    }

    public MoveTypes getType() {
        return type;
    }

    public int getPp() {
        return pp;
    }
}
