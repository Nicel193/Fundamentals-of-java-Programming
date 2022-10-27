package Task_6;

import java.util.Comparator;

public class Triangle {
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double get_area() {
        return 0.25 * (Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c)));
    }

    @Override
    public String toString() {
        return "\nTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}' + " Area{" + get_area() + "}";
    }
}