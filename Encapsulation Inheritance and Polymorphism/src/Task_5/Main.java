package Task_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(3), new Circle(6),
                new Circle(1), new Circle(10)};

        System.out.println("Default-Circles------------------------------");
        System.out.println(Arrays.toString(circles));

        Arrays.sort(circles);

        System.out.println("Sorted-Circles-------------------------------");
        System.out.println(Arrays.toString(circles));

    }
}
