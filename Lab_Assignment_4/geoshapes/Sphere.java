package geoshapes;

public class Sphere {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Sphere : \nRadius : " + radius;
    }
}