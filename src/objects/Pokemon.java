package objects;

import enums.MoveType;
import enums.Type;

import javax.swing.*;
import java.util.List;

public interface Pokemon {
    /**
     * Ottieni l'ID del Pokemon
     *
     * @return ID del Pokemon
     */
    String getId();

    /**
     * Determina il nome del Pokemon
     *
     * @return Nome del Pokemon
     */
    String getDisplayName();

    /**
     * Determina i tipi del Pokemon
     *
     * @return Tipi del Pokemon
     */
    Type[] getTypes();

    /**
     * Determina la vita massima del Pokemon
     *
     * @return Vita massima del Pokemon
     */
    int getMaxHp();

    /**
     * Determina la vita del Pokemon
     *
     * @return Vita del Pokemon
     */
    double getHp();

    /**
     * Imposta la vita del Pokemon
     */
    void setHp(double hp);

    /**
     * Determina i punti attacco del Pokemon
     *
     * @return Punti attacco del Pokemon
     */
    int getAttack();

    /**
     * Determina i punti difesa del Pokemon
     *
     * @return Punti difesa del Pokemon
     */
    int getDefense();

    /**
     * Determina i punti attacco speciale del Pokemon
     *
     * @return Punti attacco speciale del Pokemon
     */
    int getSpAtk();

    /**
     * Determina i punti difesa speciale del Pokemon
     *
     * @return Punti difesa speciale del Pokemon
     */
    int getSpDef();

    /**
     * Determina la velocità del Pokemon
     *
     * @return Velocità del Pokemon
     */
    int getSpeed();

    /**
     * Determina la lista di mosse imparabili dal Pokemon
     *
     * @return Lista di mosse imparabili dal Pokemon
     */
    List<MoveType> getLearnableMoves();

    /**
     * Determina la lista di mosse del Pokemon
     *
     * @return Lista di mosse del Pokemon
     */
    List<Move> getMoves();

    /**
     * Aggiungi una mossa al Pokemon
     *
     * @param move Mossa da aggiungere
     */
    void addMove(Move move);

    /**
     * Controlla se il Pokemon ha una determinata mossa
     *
     * @param type MoveType della mossa
     * @return True se ha la mossa, altrimenti false
     */
    boolean hasMove(MoveType type);

    /**
     * Ottieni lo sprite posteriore del Pokemon
     *
     * @return Sprite posteriore
     */
    ImageIcon getBackSprite();

    /**
     * Ottieni lo sprite frontale del Pokemon
     *
     * @return Sprite frontale
     */
    ImageIcon getFrontSprite();

    /**
     * Riproduci il grido del Pokemon
     */
    void cry();

    /**
     * Verifica se un Pokemon è utilizzabile
     *
     * @return True se è utilizzabile, false altrimenti
     */
    boolean isAvailable();

    /**
     * Registra un Pokemon nella lista dei Pokemon
     */
    void register();

    /**
     * Ottieni una nuova istanza del Pokemon
     *
     * @return Nuova istanza del Pokemon
     */
    Pokemon newInstance();
}
