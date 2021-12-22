import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a: ");
        double heSoA = scanner.nextDouble();
        System.out.println("Nhập vào hệ số b: ");
        double heSoB = scanner.nextDouble();
        System.out.println("Nhập vào hệ số c: ");
        double heSoC = scanner.nextDouble();

        QuadraticEquation quad = new QuadraticEquation(heSoA, heSoB, heSoC);

        display(heSoA, heSoB, heSoC, quad);
    }

    public static void display(double heSoA, double heSoB, double heSoC, QuadraticEquation quad) {
        if (heSoA == 0 && heSoB == 0 && heSoC == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else if (heSoA == 0 && heSoB != 0 && heSoC != 0) {
            System.out.println("Nghiệm của phương trình là: " + ((-quad.getHeSoC()) / quad.getHeSoB()));
        } else if (heSoA == 0 && heSoB == 0 || quad.getDiscriminant() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (quad.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép x = " + quad.getRoot1());
        } else {
            System.out.println("Phương trình có 2 nghiệm: x1 = " + quad.getRoot1() + "; x2 = " + quad.getRoot2());
        }
    }
}
