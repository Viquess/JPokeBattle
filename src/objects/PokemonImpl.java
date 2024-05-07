package objects;

import lombok.SneakyThrows;
import util.Datas;

public abstract class PokemonImpl implements Pokemon {
    private final String id = getClass().getSimpleName().toLowerCase();

    /***
     * Determina il nome del Pokemon
     * @return Nome del Pokemon
     */
    @Override
    public abstract String getDisplayName();

    /***
     * Determina la vita massima del Pokemon
     * @return Vita massima del Pokemon
     */
    @Override
    public abstract int getHp();

    /***
     * Determina i punti attacco del Pokemon
     * @return Punti attacco del Pokemon
     */
    @Override
    public abstract int getAttack();

    /***
     * Determina i punti difesa del Pokemon
     * @return Punti difesa del Pokemon
     */
    @Override
    public abstract int getDefense();

    /***
     * Determina i punti attacco speciale del Pokemon
     * @return Punti attacco speciale del Pokemon
     */
    @Override
    public abstract int getSpAtk();

    /***
     * Determina i punti difesa speciale del Pokemon
     * @return Punti difesa speciale del Pokemon
     */
    @Override
    public abstract int getSpDef();

    /***
     * Determina la velocità del Pokemon
     * @return Velocità del Pokemon
     */
    @Override
    public abstract int getSpeed();

    /***
     * Registra un Pokemon nella lista dei Pokemon
     */
    @Override
    public void register() {
        Datas.getPokemons().put(id, this);
    }

    /***
     * Ottieni una nuova istanza del Pokemon
     * @return Nuova istanza del Pokemon
     */
    @SneakyThrows
    public PokemonImpl newInstance() {
        return getClass().getConstructor().newInstance();
    }
}
