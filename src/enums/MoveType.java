package enums;

public enum MoveType {
    GROWL(Type.NORMAL, MoveCategory.STATUS, 0, 100, 40),
    TACKLE(Type.NORMAL, MoveCategory.PHYSICAL, 35, 95, 35),
    SCRATCH(Type.NORMAL, MoveCategory.PHYSICAL, 40, 100, 35),
    TAIL_WHIP(Type.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    BITE(Type.DARK, MoveCategory.PHYSICAL, 60, 100, 25),
    FIRE_FANG(Type.FIRE, MoveCategory.PHYSICAL, 65, 95, 15),
    ICE_FANG(Type.ICE, MoveCategory.PHYSICAL, 65, 95, 15),
    LEER(Type.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    POISON_STING(Type.POISON, MoveCategory.PHYSICAL, 15, 100, 35),
    THUNDER_FANG(Type.ELECTRIC, MoveCategory.PHYSICAL, 65, 95, 15),
    WRAP(Type.NORMAL, MoveCategory.PHYSICAL, 15, 90, 20),
    GLARE(Type.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    SCREECH(Type.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    ACID(Type.POISON, MoveCategory.SPECIAL, 40, 100, 30),
    SPIT_UP(Type.NORMAL, MoveCategory.SPECIAL, 0, 100, 10),
    STOCKPILE(Type.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    SWALLOW(Type.NORMAL, MoveCategory.STATUS, 0, 0, 10),
    ACID_SPRAY(Type.POISON, MoveCategory.SPECIAL, 40, 100, 20),
    SLUDGE_BOMB(Type.POISON, MoveCategory.SPECIAL, 90, 100, 10),
    GASTRO_ACID(Type.POISON, MoveCategory.STATUS, 0, 100, 10),
    BELCH(Type.POISON, MoveCategory.SPECIAL, 120, 90, 10),
    HAZE(Type.ICE, MoveCategory.STATUS, 0, 0, 30),
    COIL(Type.POISON, MoveCategory.STATUS, 0, 0, 20),
    GUNK_SHOT(Type.POISON, MoveCategory.PHYSICAL, 120, 80, 5),
    VINE_WHIP(Type.GRASS, MoveCategory.PHYSICAL, 45, 100, 25),
    GROWTH(Type.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    LEECH_SEED(Type.GRASS, MoveCategory.STATUS, 0, 90, 10),
    RAZOR_LEAF(Type.GRASS, MoveCategory.PHYSICAL, 55, 95, 25),
    POISON_POWDER(Type.POISON, MoveCategory.STATUS, 0, 75, 35),
    SLEEP_POWDER(Type.GRASS, MoveCategory.STATUS, 0, 75, 15),
    TAKE_DOWN(Type.NORMAL, MoveCategory.PHYSICAL, 90, 85, 20),
    SWEET_SCENT(Type.NORMAL, MoveCategory.STATUS, 0, 100, 20),
    SYNTHESIS(Type.GRASS, MoveCategory.STATUS, 0, 0, 5),
    WORRY_SEED(Type.GRASS, MoveCategory.STATUS, 0, 100, 10),
    DOUBLE_EDGE(Type.NORMAL, MoveCategory.PHYSICAL, 120, 100, 15),
    SOLAR_BEAM(Type.GRASS, MoveCategory.SPECIAL, 120, 100, 10),
    EMBER(Type.FIRE, MoveCategory.SPECIAL, 40, 100, 25),
    SMOKESCREEN(Type.NORMAL, MoveCategory.STATUS, 0, 100, 20),
    DRAGON_BREATH(Type.DRAGON, MoveCategory.SPECIAL, 60, 100, 20),
    SLASH(Type.NORMAL, MoveCategory.PHYSICAL, 70, 100, 20),
    FLAMETHROWER(Type.FIRE, MoveCategory.SPECIAL, 90, 100, 15),
    SCARY_FACE(Type.NORMAL, MoveCategory.STATUS, 0, 100, 10),
    FIRE_SPIN(Type.FIRE, MoveCategory.SPECIAL, 35, 85, 15),
    INFERNO(Type.FIRE, MoveCategory.SPECIAL, 100, 50, 5),
    FLARE_BLITZ(Type.FIRE, MoveCategory.PHYSICAL, 120, 100, 15),
    LICK(Type.GHOST, MoveCategory.PHYSICAL, 30, 100, 30),
    HYPNOSIS(Type.PSYCHIC, MoveCategory.STATUS, 0, 60, 20),
    SPITE(Type.GHOST, MoveCategory.STATUS, 0, 100, 10),
    MEAN_LOOK(Type.NORMAL, MoveCategory.STATUS, 0, 0, 5),
    CURSE(Type.GHOST, MoveCategory.STATUS, 0, 0, 10),
    NIGHT_SHADE(Type.GHOST, MoveCategory.SPECIAL, 0, 100, 15),
    CONFUSE_RAY(Type.GHOST, MoveCategory.STATUS, 0, 100, 10),
    SUCKER_PUNCH(Type.DARK, MoveCategory.PHYSICAL, 70, 100, 5),
    PAYBACK(Type.DARK, MoveCategory.PHYSICAL, 50, 100, 10),
    SHADOW_BALL(Type.GHOST, MoveCategory.SPECIAL, 80, 100, 15),
    DARK_PULSE(Type.DARK, MoveCategory.SPECIAL, 80, 100, 15),
    DESTINY_BOND(Type.GHOST, MoveCategory.STATUS, 0, 0, 5),
    HEX(Type.GHOST, MoveCategory.SPECIAL, 65, 100, 10),
    DREAM_EATER(Type.PSYCHIC, MoveCategory.SPECIAL, 100, 100, 15),
    WATER_GUN(Type.WATER, MoveCategory.SPECIAL, 40, 100, 25),
    SING(Type.NORMAL, MoveCategory.STATUS, 0, 55, 15),
    MIST(Type.ICE, MoveCategory.STATUS, 0, 0, 30),
    LIFE_DEW(Type.WATER, MoveCategory.STATUS, 0, 0, 10),
    ICE_SHARD(Type.ICE, MoveCategory.PHYSICAL, 40, 100, 30),
    WATER_PULSE(Type.WATER, MoveCategory.SPECIAL, 60, 100, 20),
    ICE_BEAM(Type.ICE, MoveCategory.SPECIAL, 90, 100, 10),
    BODY_SLAM(Type.NORMAL, MoveCategory.PHYSICAL, 85, 100, 15),
    RAIN_DANCE(Type.WATER, MoveCategory.STATUS, 0, 0, 5),
    PERISH_SONG(Type.NORMAL, MoveCategory.STATUS, 0, 0, 5),
    BRINE(Type.WATER, MoveCategory.SPECIAL, 65, 100, 10),
    SAFEGUARD(Type.NORMAL, MoveCategory.STATUS, 0, 0, 25),
    HYDRO_PUMP(Type.WATER, MoveCategory.SPECIAL, 110, 80, 5),
    BLIZZARD(Type.ICE, MoveCategory.SPECIAL, 110, 70, 5),
    SHEER_COLD(Type.ICE, MoveCategory.SPECIAL, 0, 30, 5),
    FAKE_OUT(Type.NORMAL, MoveCategory.PHYSICAL, 40, 100, 10),
    FURY_SWIPES(Type.NORMAL, MoveCategory.PHYSICAL, 18, 80, 15),
    FEINT_ATTACK(Type.DARK, MoveCategory.PHYSICAL, 60, 0, 20),
    TAUNT(Type.DARK, MoveCategory.STATUS, 0, 100, 20),
    PAY_DAY(Type.NORMAL, MoveCategory.PHYSICAL, 40, 100, 20),
    NASTY_PLOT(Type.DARK, MoveCategory.STATUS, 0, 0, 20),
    ASSURANCE(Type.DARK, MoveCategory.PHYSICAL, 60, 100, 10),
    CAPTIVATE(Type.NORMAL, MoveCategory.STATUS, 0, 100, 20),
    NIGHT_SLASH(Type.DARK, MoveCategory.PHYSICAL, 70, 100, 15),
    FEINT(Type.NORMAL, MoveCategory.PHYSICAL, 30, 100, 10),
    ROAR(Type.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    QUICK_ATTACK(Type.NORMAL, MoveCategory.PHYSICAL, 40, 100, 30),
    INCINERATE(Type.FIRE, MoveCategory.SPECIAL, 60, 100, 15),
    FLAME_BURST(Type.FIRE, MoveCategory.SPECIAL, 70, 100, 15),
    WILL_O_WISP(Type.FIRE, MoveCategory.STATUS, 0, 85, 15),
    IMPRISON(Type.PSYCHIC, MoveCategory.STATUS, 0, 0, 10),
    FIRE_BLAST(Type.FIRE, MoveCategory.SPECIAL, 110, 85, 5),
    GRUDGE(Type.GHOST, MoveCategory.STATUS, 0, 0, 5),
    SAND_ATTACK(Type.GROUND, MoveCategory.STATUS, 0, 100, 15),
    GUST(Type.FLYING, MoveCategory.SPECIAL, 40, 100, 35),
    WHIRLWIND(Type.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    TWISTER(Type.DRAGON, MoveCategory.SPECIAL, 40, 100, 20),
    FEATHER_DANCE(Type.FLYING, MoveCategory.STATUS, 0, 100, 15),
    AGILITY(Type.PSYCHIC, MoveCategory.STATUS, 0, 0, 30),
    WING_ATTACK(Type.FLYING, MoveCategory.PHYSICAL, 60, 100, 35),
    ROOST(Type.FLYING, MoveCategory.STATUS, 0, 0, 10),
    TAILWIND(Type.FLYING, MoveCategory.STATUS, 0, 0, 15),
    MIRROR_MOVE(Type.FLYING, MoveCategory.STATUS, 0, 0, 20),
    AIR_SLASH(Type.FLYING, MoveCategory.SPECIAL, 75, 95, 15),
    HURRICANE(Type.FLYING, MoveCategory.SPECIAL, 110, 70, 10),
    THUNDER_SHOCK(Type.ELECTRIC, MoveCategory.SPECIAL, 40, 100, 30),
    DOUBLE_TEAM(Type.NORMAL, MoveCategory.STATUS, 0, 0, 15),
    ELECTRO_BALL(Type.ELECTRIC, MoveCategory.SPECIAL, 0, 100, 10),
    THUNDER_WAVE(Type.ELECTRIC, MoveCategory.STATUS, 0, 90, 20),
    SPARK(Type.ELECTRIC, MoveCategory.PHYSICAL, 65, 100, 20),
    NUZZLE(Type.ELECTRIC, MoveCategory.PHYSICAL, 20, 100, 20),
    DISCHARGE(Type.ELECTRIC, MoveCategory.SPECIAL, 80, 100, 15),
    SLAM(Type.NORMAL, MoveCategory.PHYSICAL, 80, 75, 20),
    THUNDERBOLT(Type.ELECTRIC, MoveCategory.SPECIAL, 90, 100, 15),
    WILD_CHARGE(Type.ELECTRIC, MoveCategory.PHYSICAL, 90, 100, 15),
    LIGHT_SCREEN(Type.PSYCHIC, MoveCategory.STATUS, 0, 0, 30),
    THUNDER(Type.ELECTRIC, MoveCategory.SPECIAL, 110, 70, 10),
    FLAME_WHEEL(Type.FIRE, MoveCategory.PHYSICAL, 60, 100, 25),
    STOMP(Type.NORMAL, MoveCategory.PHYSICAL, 65, 100, 20),
    FLAME_CHARGE(Type.FIRE, MoveCategory.PHYSICAL, 50, 100, 20),
    BOUNCE(Type.FLYING, MoveCategory.PHYSICAL, 85, 85, 5),
    WITHDRAW(Type.WATER, MoveCategory.STATUS, 0, 0, 40),
    BUBBLE(Type.WATER, MoveCategory.SPECIAL, 40, 100, 30),
    RAPID_SPIN(Type.NORMAL, MoveCategory.PHYSICAL, 50, 100, 40),
    PROTECT(Type.NORMAL, MoveCategory.STATUS, 0, 0, 10),
    AQUA_TAIL(Type.WATER, MoveCategory.PHYSICAL, 90, 90, 10),
    SKULL_BASH(Type.NORMAL, MoveCategory.PHYSICAL, 130, 100, 10),
    IRON_DEFENSE(Type.STEEL, MoveCategory.STATUS, 0, 0, 15),
    HELPING_HAND(Type.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    PURSUIT(Type.DARK, MoveCategory.PHYSICAL, 40, 100, 20),
    MOONLIGHT(Type.FAIRY, MoveCategory.STATUS, 0, 0, 5),
    LAST_RESORT(Type.NORMAL, MoveCategory.PHYSICAL, 140, 100, 5);

    private final Type type;
    private final MoveCategory category;
    private final int power, accuracy, maxPP;

    MoveType(Type type, MoveCategory category, int power, int accuracy, int maxPP) {
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.maxPP = maxPP;
    }

    /**
     * Ottieni il tipo della mossa
     *
     * @return Tipo della mossa
     */
    public Type getType() {
        return type;
    }

    /**
     * Ottieni la categoria della mossa
     *
     * @return Categoria della mossa
     */
    public MoveCategory getCategory() {
        return category;
    }

    /**
     * Ottieni la potenza della mossa
     *
     * @return Potenza della mossa
     */
    public int getPower() {
        return power;
    }

    /**
     * Ottieni l'accuratezza della mossa
     *
     * @return Accuratezza della mossa
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Ottieni il massimo di PP della mossa
     *
     * @return Massimo di PP della mossa
     */
    public int getMaxPP() {
        return maxPP;
    }

    /**
     * Ottieni il DisplayName della mossa
     *
     * @return DisplayName della mossa
     */
    public String getDisplayName() {
        return name().replace("_", " ");
    }
}
