package Task_2;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[300];

        //Fill array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        //Implementation of the Sieve of Eratosthenes algorithm
        int next_number = 2;
        for (int i = next_number; i < arr.length; i++) {
            if (arr[i] > 0) {
                next_number = i;
            }
            for (int j = (next_number + next_number); j < arr.length; j += next_number) {
                if (arr[j] > 0) {
                    arr[j] = -arr[j];
                }
            }
        }

        //Displaying the result
        System.out.println("Result:");
        for (int i = 2, j = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.printf("%d ", arr[i]);
                j++;
            }

            if(j == 11){
                System.out.println();
                j = 0;
            }
        }
    }
}