package Task_3;

public interface IDefaultGetFunctionMin {
    double function(double x);

    default double find_min(double a, double b, double step) {
        double min = function(a);

        for (double i = a; i <= b; i += step) {
            min = Math.min(min, function(i));
        }

        return min;
    }
}
