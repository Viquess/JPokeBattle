package objects;

public class Battle {
    private Team playerTeam, opponentTeam;
    private PokemonImpl playerPokemon, opponentPokemon;

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
     * @param playerTeam Team del giocatore
     * @param opponentTeam Team avversario
     */
    public Battle(Team playerTeam, Team opponentTeam) {
        this.playerTeam = playerTeam;
        this.opponentTeam = opponentTeam;
        this.playerPokemon = playerTeam.getPokemons().get(0);
        this.opponentPokemon = opponentTeam.getPokemons().get(0);
    }

    /**
     * Ottieni il Team del player
     * @return Team del player
     */
    public Team getPlayerTeam() {
        return playerTeam;
    }

    /**
     * Ottieni il Team dell'avversario
     * @return Team dell'avversario
     */
    public Team getOpponentTeam() {
        return opponentTeam;
    }

    /**
     * Ottieni il Pokemon attualmente utilizzato dal Player
     * @return Pokemon attualmente utilizzato dal player
     */
    public PokemonImpl getPlayerPokemon() {
        return playerPokemon;
    }

    /**
     * Ottieni il Pokemon attualmente utilizzato dall'avversario
     * @return Pokemon attualmente utilizzato dall'avversario
     */
    public PokemonImpl getOpponentPokemon() {
        return opponentPokemon;
    }
}
