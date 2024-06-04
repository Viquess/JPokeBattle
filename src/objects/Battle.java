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
     * @param playerTeam   Team del giocatore
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
     *
     * @return Team del player
     */
    public Team getPlayerTeam() {
        return playerTeam;
    }

    /**
     * Ottieni il Team dell'avversario
     *
     * @return Team dell'avversario
     */
    public Team getOpponentTeam() {
        return opponentTeam;
    }

    /**
     * Ottieni il Pokemon attualmente utilizzato dal Player
     *
     * @return Pokemon attualmente utilizzato dal player
     */
    public PokemonImpl getPlayerPokemon() {
        return playerPokemon;
    }

    /**
     * Imposta il Pokemon attualmente utilizzato dal Player
     *
     * @param playerPokemon Pokemon da impostare
     * @return True se il pokemon viene impostato, false altrimenti
     */
    public boolean setPlayerPokemon(PokemonImpl playerPokemon) {
        if (!playerTeam.contains(playerPokemon))
            return false;

        this.playerPokemon = playerPokemon;
        return true;
    }

    /**
     * Ottieni il Pokemon attualmente utilizzato dall'avversario
     *
     * @return Pokemon attualmente utilizzato dall'avversario
     */
    public PokemonImpl getOpponentPokemon() {
        return opponentPokemon;
    }

    /**
     * Imposta il Pokemon attualmente utilizzato dall'avversario
     *
     * @param opponentPokemon Pokemon da impostare
     * @return True se il pokemon viene impostato, false altrimenti
     */
    public boolean setOpponentPokemon(PokemonImpl opponentPokemon) {
        if (!opponentTeam.contains(opponentPokemon))
            return false;

        this.opponentPokemon = opponentPokemon;
        return true;
    }
}
