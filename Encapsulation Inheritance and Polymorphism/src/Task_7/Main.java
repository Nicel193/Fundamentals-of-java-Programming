package Task_7;

public class Main {
    public static double compare(double a, double b){
        return ((b - a)*100)/a;
    }

    public static void main(String[] args) {
        Integrable integrableSin = Math::sin;
        TrapezoidalIntegral trapezoidalIntegralSin = Math::sin;

        Integrable integrableExp = Math::exp;
        TrapezoidalIntegral trapezoidalIntegralExp = Math::exp;

        double rectangle_integral = integrableSin.integral(0, 5, 0.1);
        double trapezoidal_integral = trapezoidalIntegralSin.integral(0, 5, 0.1);

        System.out.print("Rectangle-Integral (Sin) = ");
        System.out.println(rectangle_integral);
        System.out.print("Trapezoidal-Integral (Sin) = ");
        System.out.println(trapezoidal_integral);
        System.out.printf("Error: %f%%\n", compare(rectangle_integral, trapezoidal_integral));

        rectangle_integral = integrableExp.integral(0, 2, 0.1);
        trapezoidal_integral = trapezoidalIntegralExp.integral(0, 2, 0.1);

        System.out.print("Rectangle-Integral (Exp) = ");
        System.out.println(integrableExp.integral(0, 2, 0.1));
        System.out.print("Trapezoidal-Integral (Exp) = ");
        System.out.println(trapezoidalIntegralExp.integral(0, 2, 0.1));
        System.out.printf("Error: %f%%\n", compare(rectangle_integral, trapezoidal_integral));
    }
}
