package Task_1;

import java.util.Random;
import java.util.Arrays;

/**
 * Class created for solving subtask 2 of first task of laboratory work
 */
public class NonTraditional {
    public int[][] arr_int;
    public String[] arr_string;
    private char symbol;
    private int min;

    NonTraditional(int rows, int cols, char symbol) {
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
        Arrays.stream(arr_int).forEach(a -> Arrays.setAll(a, k -> generate_random_number()));
    }

    /**
     * The method is designed to fill the string array
     */
    public void fill_strings_array() {
        Arrays.setAll(arr_string, k -> generate_string(k));

        System.out.print('\n');
    }

    /**
     * The method is intended for sorting a string array
     */
    public void sort_strings_array() {
        Arrays.sort(arr_string);
    }

    /**
     * The method is designed to generate a random number
     * @return random number from 8 to 26
     */
    private int generate_random_number() {
        Random rand = new Random();

        int rand_number = rand.nextInt(18) + 8;

        while (rand_number % 2 != 0) rand_number = rand.nextInt(18) + 8;

        return rand_number;
    }

    /**
     * Method that search minimum element in array col
     *
     * @param index_col index of array col
     * @return filed string
     */
    private String generate_string(int index_col) {
        System.out.print(find_min_in_col(index_col) + " ");

        char[] chars = new char[find_min_in_col(index_col)];
        Arrays.fill(chars, symbol);

        return new String(chars);
    }

    /**
     * The method that search minimum element in array col
     *
     * @param index_col index of array col
     * @return mix element in array col
     */
    private int find_min_in_col(int index_col) {
        min = arr_int[0][index_col];

        Arrays.stream(arr_int).forEach(a -> {
            if (min > a[index_col]) {
                min = a[index_col];
            }
        });

        return min;
    }
}
