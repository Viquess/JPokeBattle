package objects;

import enums.Types;
import lombok.SneakyThrows;
import util.Datas;

public abstract class PokemonImpl implements Pokemon {
    private final String id = getClass().getSimpleName().toLowerCase();

    @Override
    public abstract String getDisplayName();

    @Override
    public abstract Types[] getTypes();

    @Override
    public abstract int getHp();

    @Override
    public abstract int getAttack();

    @Override
    public abstract int getDefense();

    @Override
    public abstract int getSpAtk();

    @Override
    public abstract int getSpDef();

    @Override
    public abstract int getSpeed();

    @Override
    public void register() {
        Datas.getPokemons().put(id, this);
    }

    @SneakyThrows
    public PokemonImpl newInstance() {
        return getClass().getConstructor().newInstance();
    }
}
