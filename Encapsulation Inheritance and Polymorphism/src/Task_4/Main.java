package Task_4;

public class Main {
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(COLOR_GREEN + "Array-With-Two-Dimensional:" + COLOR_RESET);
        ArrayWithTwoDimensional twoDimensional = new ArrayWithTwoDimensional();
        twoDimensional.test();

        System.out.println(COLOR_GREEN + "Array-With-One-Dimensional:" + COLOR_RESET);
        ArrayWithOneDimensional oneDimensional = new ArrayWithOneDimensional();
        oneDimensional.test();
    }
}
