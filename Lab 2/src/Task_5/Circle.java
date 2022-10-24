package Task_5;

public class Circle implements Comparable<Circle> {
    private double radius;

    public double get_radius() {
        return this.radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius: " + get_radius();
    }

    @Override
    public int compareTo(Circle o) {
        return (int)get_radius() - (int)o.get_radius();
    }
}
