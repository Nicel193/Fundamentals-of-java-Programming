package Task_3;

public class GetFunctionMin {
    public final double find_min(IFunctionMin f,double a, double b, double step) {
        double min = f.function(a);

        for (double i = a; i <= b; i += step) {
            min = Math.min(min, f.function(i));
        }

        return min;
    }
}
