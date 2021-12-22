package AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Hình tròn có bán kính: " + circle.getRadius() + " có diện tích là: " + circle.getArea() + " có màu: " + circle.getColor());

        Circle circle1 = new Circle(5, "blue");
        System.out.println("Hình tròn 1 có bán kính: " + circle1.getRadius() + " có diện tích là: " + circle1.getArea() + " có màu: " + circle1.getColor());
    }
}
