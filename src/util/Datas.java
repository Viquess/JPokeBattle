package util;

import objects.PokemonImpl;

import java.util.HashMap;

public class Datas {
    /**
     * Lista dei Pokemon registrati
     */
    private static HashMap<String, PokemonImpl> pokemons = new HashMap<>();

    /**
     * Ottieni la lista di pokemon registrati
     * @return Lista dei Pokemon registrati
     */
    public static HashMap<String, PokemonImpl> getPokemons() {
        return pokemons;
    }
}
