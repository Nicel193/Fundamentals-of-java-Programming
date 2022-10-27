package Task_1;

import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Traditional-method-------------------------------array-5x5");
        Traditional traditional = new Traditional(5, 5, 'a');

        System.out.println("Fill int array with random numbers:");
        traditional.fill_int_array();
        System.out.println(Arrays.deepToString(traditional.arr_int));

        System.out.println("Find min number in column:");
        traditional.fill_strings_array();
        System.out.println("Fill string array:");
        System.out.println(Arrays.toString(traditional.arr_string));

        System.out.println("Sort string array:");
        traditional.sort_strings_array();
        System.out.println(Arrays.toString(traditional.arr_string));

        System.out.println("NonTraditional-method----------------------------array-5x5");
        NonTraditional non_traditional = new NonTraditional(5, 5, 'a');

        System.out.println("Fill int array with random numbers:");
        non_traditional.fill_int_array();
        System.out.println(Arrays.deepToString(non_traditional.arr_int));

        System.out.println("Find min number in column:");
        non_traditional.fill_strings_array();
        System.out.println("Fill string array:");
        System.out.println(Arrays.toString(non_traditional.arr_string));

        System.out.println("Sort string array:");
        non_traditional.sort_strings_array();
        System.out.println(Arrays.toString(non_traditional.arr_string));
    }
}

