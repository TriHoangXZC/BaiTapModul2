import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Mảng sau khi được đảo ngược là: ");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
