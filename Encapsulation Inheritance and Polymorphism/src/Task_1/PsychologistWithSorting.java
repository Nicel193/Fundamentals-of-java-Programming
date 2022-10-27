package Task_1;

import java.util.Arrays;

public class PsychologistWithSorting extends PsychologistWithArray {

    PsychologistWithSorting(String surname, int experience) {
        super(surname, experience);
    }

    @Override
    public void sort_number_of_visitors() {
        Arrays.sort(get_receptions());
    }

    @Override
    public void sort_alphabetic_comments() {
        Arrays.sort(get_receptions(), new AlphabeticComp());
    }
}
