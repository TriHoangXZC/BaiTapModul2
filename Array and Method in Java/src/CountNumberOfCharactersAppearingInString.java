import java.util.Scanner;

public class CountNumberOfCharactersAppearingInString {
    public static void main(String[] args) {
        String string = "";
        String countChar = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi kí tự: ");
        string = scanner.nextLine();
        System.out.println("Nhập vào kí tự muốn đếm: ");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println("Chuỗi có: " + count + " kí tự " + character);
    }
}
