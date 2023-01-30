package shape;

import static java.lang.Math.*;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double r = super.getRadius();
        double h = this.height;
        return (2 * PI * r * r + 2 * PI * r * h);
    }

    @Override
    public double getVolume() {
        double r = super.getRadius();
        double h = this.height;
        return (PI * r * r * h);
    }

}
