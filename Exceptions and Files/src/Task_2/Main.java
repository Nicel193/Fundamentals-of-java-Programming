package Task_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void write_to_file(SumDigits[] numbers, String filename) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
            for (int i = 0; i < numbers.length; i++) {
                out.print(numbers[i].get_number() + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SumDigits[] read_numbers(String path) {
        List<SumDigits> numbers = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                if (num < 0) continue;
                numbers.add(new SumDigits(num));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return numbers.toArray(new SumDigits[0]);
    }

    public static void main(String[] args) {
        SumDigits[] numbers = read_numbers("task2.txt");
        Arrays.sort(numbers, new CompareNumbers(true));
        write_to_file(numbers, "increase.txt");
        Arrays.sort(numbers, new CompareNumbers(false));
        write_to_file(numbers, "decrease.txt");
    }
}
