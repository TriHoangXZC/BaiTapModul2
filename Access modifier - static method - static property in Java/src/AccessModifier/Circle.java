package AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";


    // constructor không tham số
    public Circle() {
    }


    // constructor có tham số
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    public String getColor() {
        return color;
    }
}
