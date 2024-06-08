package enums;

public enum MoveTypes {
    GROWL(Types.NORMAL, MoveCategory.STATUS, 0, 100, 40),
    TACKLE(Types.NORMAL, MoveCategory.PHYSICAL, 35, 95, 35),
    SCRATCH(Types.NORMAL, MoveCategory.PHYSICAL, 40, 100, 35),
    TAIL_WHIP(Types.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    BITE(Types.DARK, MoveCategory.PHYSICAL, 60, 100, 25),
    FIRE_FANG(Types.FIRE, MoveCategory.PHYSICAL, 65, 95, 15),
    ICE_FANG(Types.ICE, MoveCategory.PHYSICAL, 65, 95, 15),
    LEER(Types.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    POISON_STING(Types.POISON, MoveCategory.PHYSICAL, 15, 100, 35),
    THUNDER_FANG(Types.ELECTRIC, MoveCategory.PHYSICAL, 65, 95, 15),
    WRAP(Types.NORMAL, MoveCategory.PHYSICAL, 15, 90, 20),
    GLARE(Types.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    SCREECH(Types.NORMAL, MoveCategory.STATUS, 0, 100, 30),
    ACID(Types.POISON, MoveCategory.SPECIAL, 40, 100, 30),
    SPIT_UP(Types.NORMAL, MoveCategory.SPECIAL, 0, 100, 10),
    STOCKPILE(Types.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    SWALLOW(Types.NORMAL, MoveCategory.STATUS, 0, 0, 10),
    ACID_SPRAY(Types.POISON, MoveCategory.SPECIAL, 40, 100, 20),
    SLUDGE_BOMB(Types.POISON, MoveCategory.SPECIAL, 90, 100, 10),
    GASTRO_ACID(Types.POISON, MoveCategory.STATUS, 0, 100, 10),
    BELCH(Types.POISON, MoveCategory.SPECIAL, 120, 90, 10),
    HAZE(Types.ICE, MoveCategory.STATUS, 0, 0, 30),
    COIL(Types.POISON, MoveCategory.STATUS, 0, 0, 20),
    GUNK_SHOT(Types.POISON, MoveCategory.PHYSICAL, 120, 80, 5),
    VINE_WHIP(Types.GRASS, MoveCategory.PHYSICAL, 45, 100, 25),
    GROWTH(Types.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    LEECH_SEED(Types.GRASS, MoveCategory.STATUS, 0, 90, 10),
    RAZOR_LEAF(Types.GRASS, MoveCategory.PHYSICAL, 55, 95, 25),
    POISON_POWDER(Types.POISON, MoveCategory.STATUS, 0, 75, 35),
    SLEEP_POWDER(Types.GRASS, MoveCategory.STATUS, 0, 75, 15),
    TAKE_DOWN(Types.NORMAL, MoveCategory.PHYSICAL, 90, 85, 20),
    SWEET_SCENT(Types.NORMAL, MoveCategory.STATUS, 0, 100, 20),
    SYNTHESIS(Types.GRASS, MoveCategory.STATUS, 0, 0, 5),
    WORRY_SEED(Types.GRASS, MoveCategory.STATUS, 0, 100, 10),
    DOUBLE_EDGE(Types.NORMAL, MoveCategory.PHYSICAL, 120, 100, 15),
    SOLAR_BEAM(Types.GRASS, MoveCategory.SPECIAL, 120, 100, 10),
    EMBER(Types.FIRE, MoveCategory.SPECIAL, 40, 100, 25),
    SMOKESCREEN(Types.NORMAL, MoveCategory.STATUS, 0, 100, 20),
    DRAGON_BREATH(Types.DRAGON, MoveCategory.SPECIAL, 60, 100, 20),
    SLASH(Types.NORMAL, MoveCategory.PHYSICAL, 70, 100, 20),
    FLAMETHROWER(Types.FIRE, MoveCategory.SPECIAL, 90, 100, 15),
    SCARY_FACE(Types.NORMAL, MoveCategory.STATUS, 0, 100, 10),
    FIRE_SPIN(Types.FIRE, MoveCategory.SPECIAL, 35, 85, 15),
    INFERNO(Types.FIRE, MoveCategory.SPECIAL, 100, 50, 5),
    FLARE_BLITZ(Types.FIRE, MoveCategory.PHYSICAL, 120, 100, 15),
    LICK(Types.GHOST, MoveCategory.PHYSICAL, 30, 100, 30),
    HYPNOSIS(Types.PSYCHIC, MoveCategory.STATUS, 0, 60, 20),
    SPITE(Types.GHOST, MoveCategory.STATUS, 0, 100, 10),
    MEAN_LOOK(Types.NORMAL, MoveCategory.STATUS, 0, 0, 5),
    CURSE(Types.GHOST, MoveCategory.STATUS, 0, 0, 10),
    NIGHT_SHADE(Types.GHOST, MoveCategory.SPECIAL, 0, 100, 15),
    CONFUSE_RAY(Types.GHOST, MoveCategory.STATUS, 0, 100, 10),
    SUCKER_PUNCH(Types.DARK, MoveCategory.PHYSICAL, 70, 100, 5),
    PAYBACK(Types.DARK, MoveCategory.PHYSICAL, 50, 100, 10),
    SHADOW_BALL(Types.GHOST, MoveCategory.SPECIAL, 80, 100, 15),
    DARK_PULSE(Types.DARK, MoveCategory.SPECIAL, 80, 100, 15),
    DESTINY_BOND(Types.GHOST, MoveCategory.STATUS, 0, 0, 5),
    HEX(Types.GHOST, MoveCategory.SPECIAL, 65, 100, 10),
    DREAM_EATER(Types.PSYCHIC, MoveCategory.SPECIAL, 100, 100, 15),
    WATER_GUN(Types.WATER, MoveCategory.SPECIAL, 40, 100, 25),
    SING(Types.NORMAL, MoveCategory.STATUS, 0, 55, 15),
    MIST(Types.ICE, MoveCategory.STATUS, 0, 0, 30),
    LIFE_DEW(Types.WATER, MoveCategory.STATUS, 0, 0, 10),
    ICE_SHARD(Types.ICE, MoveCategory.PHYSICAL, 40, 100, 30),
    WATER_PULSE(Types.WATER, MoveCategory.SPECIAL, 60, 100, 20),
    ICE_BEAM(Types.ICE, MoveCategory.SPECIAL, 90, 100, 10),
    BODY_SLAM(Types.NORMAL, MoveCategory.PHYSICAL, 85, 100, 15),
    RAIN_DANCE(Types.WATER, MoveCategory.STATUS, 0, 0, 5),
    PERISH_SONG(Types.NORMAL, MoveCategory.STATUS, 0, 0, 5),
    BRINE(Types.WATER, MoveCategory.SPECIAL, 65, 100, 10),
    SAFEGUARD(Types.NORMAL, MoveCategory.STATUS, 0, 0, 25),
    HYDRO_PUMP(Types.WATER, MoveCategory.SPECIAL, 110, 80, 5),
    BLIZZARD(Types.ICE, MoveCategory.SPECIAL, 110, 70, 5),
    SHEER_COLD(Types.ICE, MoveCategory.SPECIAL, 0, 30, 5),
    FAKE_OUT(Types.NORMAL, MoveCategory.PHYSICAL, 40, 100, 10),
    FURY_SWIPES(Types.NORMAL, MoveCategory.PHYSICAL, 18, 80, 15),
    FEINT_ATTACK(Types.DARK, MoveCategory.PHYSICAL, 60, 0, 20),
    TAUNT(Types.DARK, MoveCategory.STATUS, 0, 100, 20),
    PAY_DAY(Types.NORMAL, MoveCategory.PHYSICAL, 40, 100, 20),
    NASTY_PLOT(Types.DARK, MoveCategory.STATUS, 0, 0, 20),
    ASSURANCE(Types.DARK, MoveCategory.PHYSICAL, 60, 100, 10),
    CAPTIVATE(Types.NORMAL, MoveCategory.STATUS, 0, 100, 20),
    NIGHT_SLASH(Types.DARK, MoveCategory.PHYSICAL, 70, 100, 15),
    FEINT(Types.NORMAL, MoveCategory.PHYSICAL, 30, 100, 10),
    ROAR(Types.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    QUICK_ATTACK(Types.NORMAL, MoveCategory.PHYSICAL, 40, 100, 30),
    INCINERATE(Types.FIRE, MoveCategory.SPECIAL, 60, 100, 15),
    FLAME_BURST(Types.FIRE, MoveCategory.SPECIAL, 70, 100, 15),
    WILL_O_WISP(Types.FIRE, MoveCategory.STATUS, 0, 85, 15),
    IMPRISON(Types.PSYCHIC, MoveCategory.STATUS, 0, 0, 10),
    FIRE_BLAST(Types.FIRE, MoveCategory.SPECIAL, 110, 85, 5),
    GRUDGE(Types.GHOST, MoveCategory.STATUS, 0, 0, 5),
    SAND_ATTACK(Types.GROUND, MoveCategory.STATUS, 0, 100, 15),
    GUST(Types.FLYING, MoveCategory.SPECIAL, 40, 100, 35),
    WHIRLWIND(Types.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    TWISTER(Types.DRAGON, MoveCategory.SPECIAL, 40, 100, 20),
    FEATHER_DANCE(Types.FLYING, MoveCategory.STATUS, 0, 100, 15),
    AGILITY(Types.PSYCHIC, MoveCategory.STATUS, 0, 0, 30),
    WING_ATTACK(Types.FLYING, MoveCategory.PHYSICAL, 60, 100, 35),
    ROOST(Types.FLYING, MoveCategory.STATUS, 0, 0, 10),
    TAILWIND(Types.FLYING, MoveCategory.STATUS, 0, 0, 15),
    MIRROR_MOVE(Types.FLYING, MoveCategory.STATUS, 0, 0, 20),
    AIR_SLASH(Types.FLYING, MoveCategory.SPECIAL, 75, 95, 15),
    HURRICANE(Types.FLYING, MoveCategory.SPECIAL, 110, 70, 10),
    THUNDER_SHOCK(Types.ELECTRIC, MoveCategory.SPECIAL, 40, 100, 30),
    DOUBLE_TEAM(Types.NORMAL, MoveCategory.STATUS, 0, 0, 15),
    ELECTRO_BALL(Types.ELECTRIC, MoveCategory.SPECIAL, 0, 100, 10),
    THUNDER_WAVE(Types.ELECTRIC, MoveCategory.STATUS, 0, 90, 20),
    SPARK(Types.ELECTRIC, MoveCategory.PHYSICAL, 65, 100, 20),
    NUZZLE(Types.ELECTRIC, MoveCategory.PHYSICAL, 20, 100, 20),
    DISCHARGE(Types.ELECTRIC, MoveCategory.SPECIAL, 80, 100, 15),
    SLAM(Types.NORMAL, MoveCategory.PHYSICAL, 80, 75, 20),
    THUNDERBOLT(Types.ELECTRIC, MoveCategory.SPECIAL, 90, 100, 15),
    WILD_CHARGE(Types.ELECTRIC, MoveCategory.PHYSICAL, 90, 100, 15),
    LIGHT_SCREEN(Types.PSYCHIC, MoveCategory.STATUS, 0, 0, 30),
    THUNDER(Types.ELECTRIC, MoveCategory.SPECIAL, 110, 70, 10),
    FLAME_WHEEL(Types.FIRE, MoveCategory.PHYSICAL, 60, 100, 25),
    STOMP(Types.NORMAL, MoveCategory.PHYSICAL, 65, 100, 20),
    FLAME_CHARGE(Types.FIRE, MoveCategory.PHYSICAL, 50, 100, 20),
    BOUNCE(Types.FLYING, MoveCategory.PHYSICAL, 85, 85, 5),
    WITHDRAW(Types.WATER, MoveCategory.STATUS, 0, 0, 40),
    BUBBLE(Types.WATER, MoveCategory.SPECIAL, 40, 100, 30),
    RAPID_SPIN(Types.NORMAL, MoveCategory.PHYSICAL, 50, 100, 40),
    PROTECT(Types.NORMAL, MoveCategory.STATUS, 0, 0, 10),
    AQUA_TAIL(Types.WATER, MoveCategory.PHYSICAL, 90, 90, 10),
    SKULL_BASH(Types.NORMAL, MoveCategory.PHYSICAL, 130, 100, 10),
    IRON_DEFENSE(Types.STEEL, MoveCategory.STATUS, 0, 0, 15),
    HELPING_HAND(Types.NORMAL, MoveCategory.STATUS, 0, 0, 20),
    PURSUIT(Types.DARK, MoveCategory.PHYSICAL, 40, 100, 20),
    MOONLIGHT(Types.FAIRY, MoveCategory.STATUS, 0, 0, 5),
    LAST_RESORT(Types.NORMAL, MoveCategory.PHYSICAL, 140, 100, 5);

    final Types type;
    final MoveCategory category;
    final int power, accuracy, maxPP;

    MoveTypes(Types type, MoveCategory category, int power, int accuracy, int maxPP) {
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
    public Types getType() {
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
