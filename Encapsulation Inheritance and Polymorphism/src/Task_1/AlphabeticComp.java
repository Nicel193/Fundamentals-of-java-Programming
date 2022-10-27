package Task_1;

import java.util.Comparator;

public class AlphabeticComp implements Comparator<Reception> {
    @Override
    public int compare(Reception o1, Reception o2) {
        return o1.get_comment().compareTo(o2.get_comment());
    }
}
