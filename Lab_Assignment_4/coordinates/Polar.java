package coordinates;

public class Polar {
    private double r;
    private double theta; 

    public Polar(double r, double theta) {
        this.r = r;
        this.theta = theta;
    }

    public double getR() { return r; }
    public double getTheta() { return theta; }

    public Cartesian toCartesian() {
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        return new Cartesian(x, y);
    }

    @Override
    public String toString() {
        return "Polar : "  + r + " , "  + theta;
    }
}