package Task_1;

public abstract class Doctor {
    private String surname;
    private String experience;

    Doctor(String surname, String experience)
    {
        this.surname = surname;
        this.experience = experience;
    }

    public abstract Reception[] get_receptions();

    public String get_surname() {
        return surname;
    }

    public String get_experience() {
        return experience;
    }

//    public String

    public final int find_average_number_visitors() {
        if (get_receptions().length == 0) return -1;

        int average_number_visitors = 0;
        for (int i = 0; i < get_receptions().length; i++) {
            average_number_visitors += get_receptions()[i].get_number_visitors();
        }

        return average_number_visitors / get_receptions().length;
    }

    public final int find_min_number_visitors() {
        if (get_receptions().length == 0) return -1;

        int min_number_visitors = get_receptions()[0].get_number_visitors();

        for (int i = 1; i < get_receptions().length; i++) {
            if (min_number_visitors > get_receptions()[i].get_number_visitors()) {
                min_number_visitors = get_receptions()[i].get_number_visitors();
            }
        }

        return min_number_visitors;
    }

    public final String find_longest_comment() {
        if (get_receptions().length == 0) return null;

        String longest_comment = get_receptions()[0].get_comment();

        for (int i = 1; i < get_receptions().length; i++) {
            if (longest_comment.length() < get_receptions()[i].get_comment().length()) {
                longest_comment = get_receptions()[i].get_comment();
            }
        }

        return longest_comment;
    }
}
