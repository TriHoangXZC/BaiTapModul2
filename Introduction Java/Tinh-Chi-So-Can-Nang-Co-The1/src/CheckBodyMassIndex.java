import java.util.Scanner;
import java.lang.Math;

public class CheckBodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Input your weight (kg): ");
        weight = scanner.nextDouble();

        System.out.println("Input your height (m): ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.println(bmi + " is Underweight");
        } else if (bmi < 25.0) {
            System.out.println(bmi + " is Normal");
        } else if (bmi < 30.0) {
            System.out.println(bmi + " is Overweight");
        } else {
            System.out.println(bmi + " is Obese");
        }
    }
}
