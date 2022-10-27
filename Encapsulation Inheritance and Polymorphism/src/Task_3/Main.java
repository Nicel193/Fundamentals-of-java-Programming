package Task_3;

public class Main {
    public static void main(String[] args) {
        MinSin functionMinSin = new MinSin();
        MinSqrt functionMinSqrt = new MinSqrt();

        double a = 0, b = 5, step = 0.00000001;
        double a2 = 2, b2 = 100, step2 = 1;

        System.out.println("Subtask-1-----------------------------------");
        System.out.println(functionMinSin.find_min(a, b, step));
        System.out.println(functionMinSqrt.find_min(a2, b2, step2));

        System.out.println("Subtask-2-----------------------------------");
        GetFunctionMin getFunctionMin = new GetFunctionMin();

        System.out.println(getFunctionMin.find_min(new MinSin2(), a, b, step));
        System.out.println(getFunctionMin.find_min(new MinSqrt2(), a2, b2, step2));

        System.out.println("Subtask-3-----------------------------------");
        System.out.println(new IDefaultGetFunctionMin() {
            @Override
            public double function(double x) {
                return Math.sin(x);
            }
        }.find_min(a, b, step));

        System.out.println(new IDefaultGetFunctionMin() {
            @Override
            public double function(double x) {
                return Math.sqrt(x);
            }
        }.find_min(a2, b2, step2));

        System.out.println("Subtask-4-----------------------------------");
        IFunctionMin sin_function = x -> Math.sin(x);
        IFunctionMin sqrt_function = x -> Math.sqrt(x);

        System.out.println(getFunctionMin.find_min(sin_function, a, b, step));
        System.out.println(getFunctionMin.find_min(sqrt_function, a2, b2, step2));

        System.out.println("Subtask-5-----------------------------------");
        System.out.println(getFunctionMin.find_min(Math::sin, a, b, step));
        System.out.println(getFunctionMin.find_min(Math::sqrt, a2, b2, step2));
    }
}
