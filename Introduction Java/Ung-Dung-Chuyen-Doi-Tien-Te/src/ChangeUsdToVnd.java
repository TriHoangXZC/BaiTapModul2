import java.util.Scanner;

public class ChangeUsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Input USD");
        usd = scanner.nextDouble();
        vnd = usd * 23000;
        System.out.println(usd + " USD" + " = " + vnd + " VND");
    }
}
