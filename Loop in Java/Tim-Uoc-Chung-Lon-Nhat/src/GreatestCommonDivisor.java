import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter FirstNumber: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter SecondNumber: ");
        secondNumber = scanner.nextInt();

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("No greatest common divisor");
        }
        while (firstNumber != secondNumber) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber - secondNumber;
            } else {
                secondNumber = secondNumber - firstNumber;
            }
        }
        System.out.println("Greatest common divisor is: " + secondNumber);
    }
}
