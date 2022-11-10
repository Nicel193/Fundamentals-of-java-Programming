package Task_4;

import java.util.List;

public class WorkWithNumber {
    public static int get_first_zero_element(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() == 0) {
                return i;
            }
        }

        return -1;
    }

    public static int get_count_negative_elements(List<? extends Number> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).doubleValue() < 0) {
                count++;
            }
        }

        return count;
    }

    public static <T extends  Number> T get_last_negative_element(List<? extends Number> list)
    {
        T last_element = (T) list.get(list.size() - 1);

        if(last_element.doubleValue() < 0) return last_element;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).doubleValue() < 0 && list.get(i).doubleValue() >= 0 ) {
                last_element = (T) list.get(i - 1);
            }
        }

        return last_element;
    }
}
