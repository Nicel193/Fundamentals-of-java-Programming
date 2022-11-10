package Task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] int_arr = {1, 2, 3, 4};
        Double[] double_arr = {0.5, 4.7, 6.3, 9.8};
        String[] strings_arr = {"Car", "Bike", "Airplane", "Bus"};

        Integer[] int_arr_rep = {7, 8, 9, 10};
        Double[] double_arr_rep = {0.1, 0.2, 0.3, 0.4, 0.5};
        String[] strings_arr_rep = {"X", "XX", "XXX"};

        System.out.println("Swap-Group---------------------");
        WorkWithArrays.swap_group(int_arr, 0, 3);
        WorkWithArrays.swap_group(double_arr, 0, 3);
        WorkWithArrays.swap_group(strings_arr, 0, 3);
        System.out.println(Arrays.toString(int_arr));
        System.out.println(Arrays.toString(double_arr));
        System.out.println(Arrays.toString(strings_arr));

        System.out.println("Swap-Pair----------------------");
        WorkWithArrays.swap_pair(int_arr);
        WorkWithArrays.swap_pair(double_arr);
        WorkWithArrays.swap_pair(strings_arr);
        System.out.println(Arrays.toString(int_arr));
        System.out.println(Arrays.toString(double_arr));
        System.out.println(Arrays.toString(strings_arr));

        System.out.println("Replacement---------------------");
        WorkWithArrays.replacement(int_arr, int_arr_rep);
        WorkWithArrays.replacement(double_arr, double_arr_rep);
        WorkWithArrays.replacement(strings_arr, strings_arr_rep);
        System.out.println(Arrays.toString(int_arr));
        System.out.println(Arrays.toString(double_arr));
        System.out.println(Arrays.toString(strings_arr));
    }
}
