import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers;
        System.out.println("Nhập vào số lượng SNT cần in: ");
        numbers = scanner.nextInt();
        int count = 0;
        int number = 2;
        while (count < numbers) {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
