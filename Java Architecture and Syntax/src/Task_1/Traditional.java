package Task_1;

import java.util.Random;

/**
 * Class created for solving subtask 1 of first task of laboratory work
 */
public class Traditional {
    public int[][] arr_int;
    public String[] arr_string;
    private char symbol;

    Traditional(int rows, int cols, char symbol) {
        if(rows == 0 || cols == 0){
            System.err.println("Incorrect value");
            System.exit(-1);
        }

        //Initialization
        this.arr_int = new int[rows][cols];
        this.arr_string = new String[cols];
        this.symbol = symbol;
    }

    /**
     * The method is designed to fill a two-dimensional int array with random values
     */
    public void fill_int_array() {
        Random rand = new Random();

        for (int i = 0; i < arr_int.length; i++) {
            for (int j = 0; j < arr_int[i].length; j++) {
                int rand_number = rand.nextInt(18) + 8;

                while (rand_number % 2 != 0) rand_number = rand.nextInt(18) + 8;

                arr_int[i][j] = rand_number;
            }
        }
    }

    /**
     * The method is designed to fill the string array
     */
    public void fill_strings_array() {
        for (int i = 0; i < arr_string.length; i++) {
            arr_string[i] = "";

            //Write min number in column
            System.out.printf(find_min_in_col(i) + " ");

            //Add symbols
            for (int j = 0; j < find_min_in_col(i); j++) {
                arr_string[i] += symbol;
            }
        }
        System.out.print('\n');
    }

    /**
     * The method is intended for sorting a string array using the "bubble" algorithm
     */
    public void sort_strings_array() {
        for (int out = arr_string.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr_string[in].length() > arr_string[in + 1].length()) {
                    String temp = arr_string[in];
                    arr_string[in] = arr_string[in + 1];
                    arr_string[in + 1] = temp;
                }
            }
        }
    }

    /**
     * The method that search minimum element in array col
     *
     * @param index_col index of array col
     * @return mix element in array col
     */
    private int find_min_in_col(int index_col) {
        int min = arr_int[0][index_col];

        for (int i = 0; i < arr_int.length; i++) {
            if (min > arr_int[i][index_col]) {
                min = arr_int[i][index_col];
            }
        }

        return min;
    }
}