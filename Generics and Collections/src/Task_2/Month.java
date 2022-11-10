package Task_2;

public enum Month {
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(30),
    July(31),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31);

    private int days;

    Month(int count_days) {
        this.days = count_days;
    }

    public Month get_next() {
        return values()[(ordinal() + 1) % values().length];
    }

    public Month get_last() {
        return values()[(ordinal() - 1) % values().length];
    }

    public String get_season() {
        if (ordinal() == December.ordinal() || (ordinal() >= January.ordinal() && ordinal() < March.ordinal()))
            return "Зима";
        if (ordinal() >= September.ordinal() && ordinal() < December.ordinal())
            return "Весна";
        if (ordinal() >= June.ordinal() && ordinal() < September.ordinal())
            return "Літо";

        return "Осінь";
    }

    public static void all_month_info() {
        for (int i = 0; i < values().length; i++) {
            System.out.println(values()[i]);
        }
    }

    @Override
    public String toString() {
        String result = get_season() + " | ";

        result += switch (this) {
            case January -> "Січень";
            case February -> "Лютий";
            case March -> "Березень";
            case April -> "Квітень";
            case May -> "Травень";
            case June -> "Червень";
            case July -> "Липень";
            case August -> "Серпень";
            case September -> "Вересень";
            case October -> "Жовтень";
            case November -> "Листопад";
            case December -> "Грудень";
            default -> "";
        };

        return result + " | Кількість днів: " + days;
    }
}
