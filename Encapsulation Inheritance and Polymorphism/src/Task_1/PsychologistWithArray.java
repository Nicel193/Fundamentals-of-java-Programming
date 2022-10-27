package Task_1;

import java.util.Arrays;

public class PsychologistWithArray extends Doctor {
    private Reception[] receptios = {};

    PsychologistWithArray(String surname, int experience) {
        super(surname, experience);
    }

    @Override
    public Reception[] get_receptions() {
        return receptios;
    }

    @Override
    public int get_receptions_count() {
        return receptios.length;
    }

    @Override
    public void add_reception(Reception new_reception) {
        Reception[] new_arr = Arrays.copyOf(receptios, get_receptions_count() + 1);

        new_arr[get_receptions_count()] = new_reception;

        receptios = new_arr;
    }
}
