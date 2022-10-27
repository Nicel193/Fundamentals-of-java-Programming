package Task_7;

public interface Integrable {
    double function(double x);

    default double integral(double from, double to, double interval) {
        int h = (int) ((to - from) / interval);
        double sum = 0;

        for (double x = from + interval / 2; x <= (to + interval * 0.1); x += interval)
            sum += function(x);

        return sum * interval;
    }
}
