package objects;

import enums.MoveTypes;
import enums.Types;

import java.util.List;

public interface Pokemon {
    /**
     * Determina il nome del Pokemon
     * @return Nome del Pokemon
     */
    String getDisplayName();

    /**
     * Determina i tipi del Pokemon
     * @return Tipi del Pokemon
     */
    Types[] getTypes();

    /**
     * Determina la vita del Pokemon
     * @return Vita del Pokemon
     */
    int getHp();

    /**
     * Determina i punti attacco del Pokemon
     * @return Punti attacco del Pokemon
     */
    int getAttack();

    /**
     * Determina i punti difesa del Pokemon
     * @return Punti difesa del Pokemon
     */
    int getDefense();

    /**
     * Determina i punti attacco speciale del Pokemon
     * @return Punti attacco speciale del Pokemon
     */
    int getSpAtk();

    /**
     * Determina i punti difesa speciale del Pokemon
     * @return Punti difesa speciale del Pokemon
     */
    int getSpDef();

    /**
     * Determina la velocità del Pokemon
     * @return Velocità del Pokemon
     */
    int getSpeed();

    /**
     * Determina la lista di mosse imparabili dal Pokemon
     * @return Lista di mosse imparabili dal Pokemon
     */
    List<MoveTypes> getLearnableMoves();

    /**
     * Determina la lista di mosse del Pokemon
     * @return Lista di mosse del Pokemon
     */
    List<Move> getMoves();

    /**
     * Registra un Pokemon nella lista dei Pokemon
     */
    void register();

    /**
     * Ottieni una nuova istanza del Pokemon
     * @param moves Mosse del pokemon
     * @return Nuova istanza del Pokemon
     */
    Pokemon newInstance(List<Move> moves);
}
