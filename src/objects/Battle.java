package objects;

public class Battle {
    private Team playerTeam, opponentTeam;

    /**
     * Inizializza una nuova battaglia
     */
    public Battle() {
        playerTeam = new Team();
        opponentTeam = new Team();
    }

    /**
     * Inizializza una nuova battaglia
     *
     * @param playerTeam   Team del giocatore
     * @param opponentTeam Team avversario
     */
    public Battle(Team playerTeam, Team opponentTeam) {
        this.playerTeam = playerTeam;
        this.opponentTeam = opponentTeam;
    }
}
