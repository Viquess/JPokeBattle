package enums;

public enum MoveTypes {
    GROWL(Types.NORMAL, MoveCategory.STATUS, 0, 100);

    private Types type;
    private MoveCategory category;
    private int power;
    private int accuracy;

    MoveTypes(Types type, MoveCategory category, int power, int accuracy) {
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
    }
}
