import gui.Application;
import objects.impl.*;
import util.Utils;

import javax.swing.plaf.FontUIResource;

public class JPokeBattle {

    public static void main(String[] args) {
        registerPokemons();

        FontUIResource font = Utils.getFont("files\\PokemonFont.ttf", 12f);
        Utils.registerFonts(font, Utils.getFont("files\\BattleFont.ttf", 12f));
        Utils.setUIFont(new FontUIResource(font));

        new Application();
    }

    /**
     * Registra tutti i tipi di Pokemon
     */
    private static void registerPokemons() {
        new Arbok().register();
        new Bulbasaur().register();
        new Charmander().register();
        new Gengar().register();
        new Lapras().register();
        new Meowth().register();
        new Ninetales().register();
        new Pidgeot().register();
        new Raichu().register();
        new Rapidash().register();
        new Squirtle().register();
        new Umbreon().register();
    }
}