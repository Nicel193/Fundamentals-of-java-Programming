package Task_6;

import java.util.Comparator;

public class CompareByArea implements Comparator<Triangle> {
    @Override
    public int compare(Triangle o1, Triangle o2) {
        return Double.compare(o1.get_area(), o2.get_area());
    }
}