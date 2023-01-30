package shape;

import static java.lang.Math.*;

public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        double r = super.getRadius();
        return (4 * PI * r * r);
    }

    @Override
    public double getVolume() {
        double r = super.getRadius();
        return (4 / 3 * PI * r * r * r);
    }

}