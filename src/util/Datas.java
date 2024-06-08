package util;

import objects.PokemonImpl;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Datas {
    /**
     * Lista dei Pokemon registrati
     */
    private static HashMap<String, PokemonImpl> pokemons = new HashMap<>();

    /**
     * Ottieni la lista di pokemon registrati
     *
     * @return Lista dei Pokemon registrati
     */
    public static HashMap<String, PokemonImpl> getPokemons() {
        return pokemons;
    }

    /**
     * Ottieni la classifica attuale
     *
     * @return Classifica
     */
    public static LinkedHashMap<String, Integer> getLeaderboard() {
        LinkedHashMap<String, Integer> leaderboard = new LinkedHashMap<>();

        try {
            for (String line : Files.readAllLines(Paths.get(Utils.getURL("files\\leaderboard.txt").toURI()))) {
                String[] values = line.split(",");
                leaderboard.put(values[0], Integer.parseInt(values[1]));
            }
        } catch (Exception ignored) {
        }

        return leaderboard;
    }

    /**
     * Aggiungi una persona alla classifica
     *
     * @param name   Nome della persona
     * @param points Punteggio della persona
     */
    public static void addToLeaderboard(String name, int points) {
        if (getLeaderboardWorstPoints() >= points)
            return;

        int i = 0;
        String text = "";
        boolean inserted = false;
        for (Map.Entry<String, Integer> entry : getLeaderboard().entrySet()) {
            if (++i >= 10)
                break;

            if (!inserted && entry.getValue() < points) {
                text = text.concat("%s,%s\n".formatted(name.replace(",", " "), points));
                inserted = true;
            }

            text = text.concat("%s,%s\n".formatted(entry.getKey().replace(",", " "), entry.getValue()));
        }

        if (!inserted)
            text = text.concat("%s,%s\n".formatted(name.replace(",", " "), points));

        try {
            Files.write(Paths.get(Utils.getURL("files\\leaderboard.txt").toURI()), text.getBytes());
        } catch (Exception ignored) {
        }
    }

    /*
    Ottavio,8

    Mario,12
    Franco,10
    Gianluca,7
    Laura,3
     */

    /**
     * Ottieni il punteggio dell'ultima persona in classifica
     *
     * @return Punteggio dell'ultima persona in classifica
     */
    public static int getLeaderboardWorstPoints() {
        LinkedHashMap<String, Integer> leaderboard = getLeaderboard();
        if (leaderboard.size() < 10)
            return 0;

        int points = 0;
        for (Map.Entry<String, Integer> entry : leaderboard.entrySet())
            points = entry.getValue();

        return points;
    }
}
