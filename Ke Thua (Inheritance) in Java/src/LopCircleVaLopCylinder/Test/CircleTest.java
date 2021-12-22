package LopCircleVaLopCylinder.Test;


import LopCircleVaLopCylinder.Model.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(7.0, "blue");
        System.out.println(circle);
    }
}
