package util;

import lombok.Getter;
import objects.PokemonImpl;

import java.util.HashMap;

public class Datas {
    @Getter public static HashMap<String, PokemonImpl> pokemons = new HashMap<>();
}
