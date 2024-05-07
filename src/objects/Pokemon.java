package objects;

public interface Pokemon {
    String getDisplayName();

    int getHp();

    int getAttack();

    int getDefense();

    int getSpAtk();

    int getSpDef();

    int getSpeed();

    void register();

    Pokemon newInstance();
}
