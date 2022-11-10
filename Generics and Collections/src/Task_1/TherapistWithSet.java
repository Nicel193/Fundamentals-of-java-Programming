package Task_1;

import java.util.*;

public class TherapistWithSet extends Doctor {
    private SortedSet<Reception> receptions = new TreeSet<Reception>();

    TherapistWithSet(String surname, int experience) {
        super(surname, experience);
    }

    @Override
    public Reception[] get_receptions() {
        Reception[] rec = new Reception[get_receptions_count()];
        receptions.toArray(rec);
        return rec;
    }

    @Override
    public void set_reception(int index, Reception reception) {
        receptions.add(reception);
    }

    @Override
    public int get_receptions_count() {
        return receptions.size();
    }

    @Override
    public void add_reception(Reception new_reception) {
        receptions.add(new_reception);
    }

    @Override
    public void sort_number_of_visitors() {
        SortedSet<Reception> new_receptions = new TreeSet<Reception>((r1, r2) -> {
            return r1.get_number_visitors() - r2.get_number_visitors();
        });

        new_receptions.addAll(receptions);
        receptions = new_receptions;
    }

    @Override
    public void sort_alphabetic_comments() {
        SortedSet<Reception> new_receptions = new TreeSet<Reception>((r1, r2) -> {
            return r1.get_comment().compareTo(r2.get_comment());
        });

        new_receptions.addAll(receptions);
        receptions = new_receptions;
    }
}
