package Task_2;

import java.util.Comparator;
import java.util.Objects;

public class CompareNumbers implements Comparator<SumDigits> {
    private boolean sort_by_increase;

    CompareNumbers(boolean sort_by_increase) {
        this.sort_by_increase = sort_by_increase;
    }

    @Override
    public int compare(SumDigits o1, SumDigits o2) {
        return sort_by_increase ? (o1.get_sum_digits() - o2.get_sum_digits()) :
                (o2.get_sum_digits() - o1.get_sum_digits());
    }
}
