package Task_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Triangle[] triangles = {new Triangle(4, 9, 6.5), new Triangle(5, 5, 8)
                , new Triangle(5, 5.2, 5),  new Triangle(0.5, 0.2, 0.45)};

        System.out.println("Default-Triangles------------------------------");
        System.out.println(Arrays.toString(triangles));

        Arrays.sort(triangles, new CompareByArea());

        System.out.println("Sorted-Triangles-------------------------------");
        System.out.println(Arrays.toString(triangles));
    }
}