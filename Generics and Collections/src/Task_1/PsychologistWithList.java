package Task_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PsychologistWithList extends Doctor {
    private List<Reception> receptions = new ArrayList<>();

    PsychologistWithList(String surname, int experience) {
        super(surname, experience);
    }

    @Override
    public Reception[] get_receptions() {
        Reception[] rec = new Reception[get_receptions_count()];
        receptions.toArray(rec);
        return rec;
    }

    public void set_reception(int index, Reception reception) {
        receptions.set(index, reception);
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
        Collections.sort(receptions);
    }

    @Override
    public void sort_alphabetic_comments() {
        receptions.sort((r1, r2) -> {
            return r1.get_comment().compareTo(r2.get_comment());
        });
    }
}
