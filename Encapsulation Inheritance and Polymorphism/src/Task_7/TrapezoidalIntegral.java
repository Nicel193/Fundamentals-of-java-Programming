package Task_7;

public interface TrapezoidalIntegral extends Integrable {
    @Override
    default double integral(double from, double to, double interval) {
        double sumFirstLast = 0;
        double sumOverall = 0;

        for (double x = from; x <= (to + interval * 0.1); x += interval) {
            if (x == from || x + interval > (to + interval * 0.1)) {
                sumFirstLast += function(x);
            }
            else {
                sumOverall += function(x);
            }
        }
        return interval * (sumFirstLast / 2 + sumOverall);
    }
}
