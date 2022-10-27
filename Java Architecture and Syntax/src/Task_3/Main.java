package Task_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static long[] arr = {0, 1};

    public static void main(String[] args) {
        while (true) {
            System.out.print("input \"n\" to find Fibonacci number: ");

            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if (n < 0) {
                System.err.println("\"n\" must be greater than or equal to \"0\"");
                System.exit(-1);
            }
            if(n > 92){
                System.err.println("\"n\" must be less than \"93\"");
                System.exit(-1);
            }

            //Fill the array if "n" is not already in the array
            if (n >= arr.length) {
                arr = Arrays.copyOf(arr, n + 1);

                for (int i = 2; i < arr.length; ++i) {
                    arr[i] = arr[i - 2] + arr[i - 1];
                }
            }

            System.out.printf("F(%d) = %d\n", n, arr[n]);
        }
    }
}