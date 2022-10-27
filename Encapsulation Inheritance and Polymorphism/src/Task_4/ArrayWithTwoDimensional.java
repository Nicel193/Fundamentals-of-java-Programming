package Task_4;

public class ArrayWithTwoDimensional extends AbstractArrayOfPoints {
    private double[][] arr = {};

    @Override
    public void setPoint(int i, double x, double y) {
        if (i >= count()) return;

        arr[i][0] = x;
        arr[i][1] = y;
    }

    @Override
    public double getX(int i) {
        return arr[i][0];
    }

    @Override
    public double getY(int i) {
        return arr[i][1];
    }

    @Override
    public int count() {
        return arr.length;
    }

    @Override
    public void addPoint(double x, double y) {
        double[][] new_arr = new double[count() + 1][2];

        for (int i = 0; i < count(); i++) {
            new_arr[i][0] = arr[i][0];
            new_arr[i][1] = arr[i][1];
        }

        new_arr[count()][0] = x;
        new_arr[count()][1] = y;

        arr = new_arr;
    }

    @Override
    public void removeLast() {
        if (count() == 0) return;

        double[][] new_arr = new double[count() - 1][2];

        for (int i = 0; i < count() - 1; i++) {
            new_arr[i][0] = arr[i][0];
            new_arr[i][1] = arr[i][1];
        }

        arr = new_arr;
    }
}
