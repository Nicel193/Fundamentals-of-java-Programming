package Task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] int_arr = {3, -2, -1, 1, 6, 3, 0, 5};
        List<Integer> int_list = new ArrayList<Integer>(Arrays.asList(int_arr));

        Double[] double_arr = {7.4, -0.1, -1.5, 0.0, 6.7, -3.2, 5.1};
        List<Double> double_list = new ArrayList<Double>(Arrays.asList(double_arr));

        System.out.println("Integer:");
        System.out.println("First-zero-element: " + WorkWithNumber.get_first_zero_element(int_list));
        System.out.println("Count-negative-elements: " + WorkWithNumber.get_count_negative_elements(int_list));
        System.out.println("Last-negative-element: " + WorkWithNumber.get_last_negative_element(int_list));

        System.out.println("\nDouble:");
        System.out.println("First-zero-element: " + WorkWithNumber.get_first_zero_element(double_list));
        System.out.println("Count-negative-elements: " + WorkWithNumber.get_count_negative_elements(double_list));
        System.out.println("Last-negative-element: " + WorkWithNumber.get_last_negative_element(double_list));

    }
}
