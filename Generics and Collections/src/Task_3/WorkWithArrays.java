package Task_3;

public class WorkWithArrays {
    public static <T> void swap_group(T[] arr, int first_group, int second_group) {
        if(first_group > arr.length || second_group > arr.length || first_group > second_group) return;

        for (int i = first_group, j = second_group; i < second_group && j < arr.length; i++, j++) {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static <T> void swap_pair(T[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            T temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
    }

    public static <T> void replacement(T[] arr, T[] replace_arr) {
        for (int i = 0; i < arr.length && i < replace_arr.length; i++) {
            arr[i] = replace_arr[i];
        }
    }
}
