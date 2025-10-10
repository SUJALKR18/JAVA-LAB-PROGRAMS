package coordinates;

public class Cartesian {
    private double x;
    private double y;

    public Cartesian(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    
    public Polar toPolar() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return new Polar(r, theta);
    }

    @Override
    public String toString() {
        return "Cartesian " + x + " , " + y;
    }
}