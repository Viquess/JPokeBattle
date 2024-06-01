package objects;

import util.Datas;
import util.Utils;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<PokemonImpl> pokemons;

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
     * @return true se è stato possibile rimuoverlo, altrimenti false
     */
    public boolean remove(PokemonImpl pokemon) {
        return pokemons.remove(pokemon);
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
}
