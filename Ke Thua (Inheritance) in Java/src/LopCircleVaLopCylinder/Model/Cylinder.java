package LopCircleVaLopCylinder.Model;

public class Cylinder extends Circle {
    private double height = 4;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }


    @Override
    public String toString() {
        return "A Cylinder { height = "
                + getHeight()
                + " ; radius = "
                + getRadius()
                + " ; color = "
                + getColor()
                + " ; volume = "
                + getVolume()
                + " ; area = "
                + getArea()
                + " } ";
    }
}
