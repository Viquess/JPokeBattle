package enums;

import util.Utils;

import javax.swing.*;

public enum Types {
    NORMAL(new String[]{}, new String[]{"ROCK", "STEEL"}, new String[]{"GHOST"}),
    FIRE(new String[]{"GRASS", "ICE", "BUG", "STEEL"}, new String[]{"FIRE", "WATER", "ROCK", "DRAGON"}, new String[]{}),
    WATER(new String[]{"FIRE", "GROUND", "ROCK"}, new String[]{"WATER", "GRASS", "DRAGON"}, new String[]{}),
    GRASS(new String[]{"WATER", "GROUND", "ROCK"}, new String[]{"FIRE", "GRASS", "POISON", "FLYING", "BUG", "DRAGON", "STEEL"}, new String[]{}),
    ELECTRIC(new String[]{"WATER", "FLYING"}, new String[]{"GRASS", "ELECTRIC", "DRAGON"}, new String[]{"GROUND"}),
    ICE(new String[]{"GRASS", "GROUND", "FLYING", "DRAGON"}, new String[]{"FIRE", "WATER", "ICE", "STEEL"}, new String[]{}),
    FIGHTING(new String[]{"NORMAL", "ICE", "ROCK", "DARK", "STEEL"}, new String[]{"POISON", "FLYING", "PSYCHIC", "BUG", "FAIRY"}, new String[]{"GHOST"}),
    POISON(new String[]{"GRASS", "FAIRY"}, new String[]{"POISON", "GROUND", "ROCK", "GHOST"}, new String[]{"STEEL"}),
    GROUND(new String[]{"FIRE", "ELECTRIC", "POISON", "ROCK", "STEEL"}, new String[]{"GRASS", "BUG"}, new String[]{"FLYING"}),
    FLYING(new String[]{"GRASS", "FIGHTING", "BUG"}, new String[]{"ELECTRIC", "ROCK", "STEEL"}, new String[]{}),
    PSYCHIC(new String[]{"FIGHTING", "POISON"}, new String[]{"PSYCHIC", "STEEL"}, new String[]{"DARK"}),
    BUG(new String[]{"GRASS", "PSYCHIC", "DARK"}, new String[]{"FIRE", "FIGHTING", "POISON", "FLYING", "GHOST", "STEEL", "FAIRY"}, new String[]{}),
    ROCK(new String[]{"FIRE", "ICE", "FLYING", "BUG"}, new String[]{"FIGHTING", "GROUND", "STEEL"}, new String[]{}),
    GHOST(new String[]{"PSYCHIC", "GHOST"}, new String[]{"DARK"}, new String[]{"NORMAL"}),
    DRAGON(new String[]{"DRAGON"}, new String[]{"STEEL"}, new String[]{"FAIRY"}),
    DARK(new String[]{"PSYCHIC", "GHOST"}, new String[]{"FIGHTING", "DARK", "FAIRY"}, new String[]{}),
    STEEL(new String[]{"ICE", "ROCK", "FAIRY"}, new String[]{"FIRE", "WATER", "ELECTRIC", "STEEL"}, new String[]{}),
    FAIRY(new String[]{"FIGHTING", "DRAGON", "DARK"}, new String[]{"FIRE", "POISON", "STEEL"}, new String[]{});

    final String[] superEffective, notVeryEffective, noEffect;

    Types(String[] superEffective, String[] notVeryEffective, String[] noEffect) {
        this.superEffective = superEffective;
        this.notVeryEffective = notVeryEffective;
        this.noEffect = noEffect;
    }

    /**
     * Verifica se il tipo è superefficace su un altro tipo
     *
     * @param type Tipo su cui verificare
     * @return True se è superefficace, false altrimenti
     */
    public boolean isSuperEffectiveOn(Types type) {
        for (String s : superEffective)
            if (s.equalsIgnoreCase(type.name()))
                return true;

        return false;
    }

    /**
     * Verifica se il tipo non è efficace su un altro tipo
     *
     * @param type Tipo su cui verificare
     * @return True se non è efficace, false altrimenti
     */
    public boolean isNotVeryEffectiveOn(Types type) {
        for (String s : notVeryEffective)
            if (s.equalsIgnoreCase(type.name()))
                return true;

        return false;
    }

    /**
     * Verifica se il tipo non ha effetto su un altro tipo
     *
     * @param type Tipo su cui verificare
     * @return True se non ha effetto, false altrimenti
     */
    public boolean hasNoEffectOn(Types type) {
        for (String s : noEffect)
            if (s.equalsIgnoreCase(type.name()))
                return true;

        return false;
    }

    /**
     * Ottieni la tag relativa al tipo
     *
     * @param width Larghezza della tag
     * @return Tag
     */
    public ImageIcon getTag(int width) {
        return Utils.resize(new ImageIcon(Utils.getURL("files\\types\\%s.png".formatted(name().toLowerCase()))), width, (width * 77) / 176);
    }
}
