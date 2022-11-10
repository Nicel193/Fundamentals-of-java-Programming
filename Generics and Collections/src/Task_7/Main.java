package Task_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> offset_index_array = new OffsetIndexArray<Integer>(-5, 5);

        for (int i = -5; i <= 5; i++) {
            offset_index_array.add(i);
        }

        System.out.println("Array: " + offset_index_array);
        System.out.println("Size array: " + offset_index_array.size());

        offset_index_array.remove(0);
        offset_index_array.set(2, -9);

        System.out.println("Array(With remove and set): " + offset_index_array);
        System.out.println("IndexOf (2): " + offset_index_array.indexOf(2));

        System.out.print("Iterator: [");
        for (Iterator<Integer> i = offset_index_array.iterator(); i.hasNext(); ) {
            System.out.print(i.next() + ",");
        }
        System.out.print("]");
    }
}
