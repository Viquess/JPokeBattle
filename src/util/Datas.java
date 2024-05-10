package util;

import lombok.Getter;
import objects.PokemonImpl;

import java.util.HashMap;

public class Datas {
    /**
     * Lista dei pokemon registrati
     */
    @Getter private static HashMap<String, PokemonImpl> pokemons = new HashMap<>();
}
