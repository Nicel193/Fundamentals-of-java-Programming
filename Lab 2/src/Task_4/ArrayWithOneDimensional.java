package Task_4;

import java.util.Arrays;

public class ArrayWithOneDimensional extends AbstractArrayOfPoints {
    private double[] arr = {};

    @Override
    public void setPoint(int i, double x, double y) {
        if ((i / 2) > count()) return;

        arr[(i * 2)] = x;
        arr[(i * 2) + 1] = y;
    }

    @Override
    public double getX(int i) {
        return arr[i * 2];
    }

    @Override
    public double getY(int i) {
        return arr[(i * 2) + 1];
    }

    @Override
    public int count() {
        return arr.length / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] new_arr = Arrays.copyOf(arr, arr.length + 2);

        new_arr[arr.length] = x;
        new_arr[arr.length + 1] = y;

        arr = new_arr;
    }

    @Override
    public void removeLast() {
        double[] new_arr = Arrays.copyOf(arr, arr.length - 2);

        arr = new_arr;
    }
}
