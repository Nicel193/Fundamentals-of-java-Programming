package Task_3;

public abstract class FunctionMinBase {
    public abstract double function(double x);

    public final double find_min(double a, double b, double step) {
        double min = function(a);

        for (double i = a; i <= b; i += step) {
            min = Math.min(min, function(i));
        }

        return min;
    }
}
