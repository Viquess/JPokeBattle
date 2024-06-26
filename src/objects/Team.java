package objects;

import util.Datas;
import util.Utils;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<PokemonImpl> pokemons;

    /**
     * Crea un nuovo Team con Pokemon randomici
     *
     * @param size Grandezza del Team
     * @return Team randomico
     */
    public static Team getRandom(int size) {
        Team team = new Team();

        for (int i = 0; i < size; i++) {
            PokemonImpl pokemon = Utils.randOf(Datas.getPokemons().values());
            while (team.contains(pokemon))
                pokemon = Utils.randOf(Datas.getPokemons().values());

            team.add(pokemon.newInstance());
        }

        return team;
    }

    /**
     * Crea un nuovo Team
     */
    public Team() {
        pokemons = new ArrayList<>();
    }

    /**
     * Ottieni la lista di Pokemon che compongono il Team
     *
     * @return lista di Pokemon
     */
    public List<PokemonImpl> getPokemons() {
        return pokemons;
    }

    /**
     * Controlla se il Team è pieno
     *
     * @return true se il team è pieno, altrimenti false
     */
    public boolean isFull() {
        return size() >= 6;
    }

    /**
     * Aggiungi un pokemon al Team
     *
     * @param pokemon Pokemon da aggiungere
     * @return true se è stato possibile aggiungerlo, altrimenti false
     */
    public boolean add(PokemonImpl pokemon) {
        if (isFull())
            return false;

        pokemons.add(pokemon);
        return true;
    }

    /**
     * Rimuovi un pokemon dal Team
     *
     * @param pokemon Pokemon da rimuovere
     */
    public void remove(PokemonImpl pokemon) {
        pokemons.remove(pokemon);
    }

    /**
     * Controlla se un Pokemon è presente nel Team
     *
     * @param pokemon Pokemon da verificare
     * @return true se presente, altrimenti false
     */
    public boolean contains(PokemonImpl pokemon) {
        for (PokemonImpl member : pokemons)
            if (member.getId().equalsIgnoreCase(pokemon.getId()))
                return true;

        return false;
    }

    /**
     * Ottieni il numero di Pokemon presenti nel Team
     *
     * @return numero di Pokemon nel Team
     */
    public int size() {
        return pokemons.size();
    }

    /**
     * Ottieni il numero di Pokemon morti nel Team
     *
     * @return Quantità di Pokemon morti
     */
    public int getDeadPokemons() {
        int deaths = 0;
        for (PokemonImpl pokemon : pokemons)
            if (pokemon.getHp() == 0)
                deaths++;

        return deaths;
    }

    /**
     * Verifica se ci sono Pokemon utilizzabili nel Team
     *
     * @return True se ci sono, false altrimenti
     */
    public boolean hasPokemonAvailable() {
        for (PokemonImpl pokemon : pokemons) {
            if (pokemon.isAvailable())
                return true;
        }
        return false;
    }
}
