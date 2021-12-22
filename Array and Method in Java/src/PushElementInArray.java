import java.util.Arrays;
import java.util.Scanner;

public class PushElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;

        System.out.println("Nhập giá trị muốn thêm: ");
        int number = scanner.nextInt();

        do {
            System.out.println("Nhập vị trí muốn thêm: ");
            index = scanner.nextInt();
            int[] arrayNew = new int[array.length + 1];
            for (int i = 0; i < index - 1; i++) {
                arrayNew[i] = array[i];
            }
            for (int i = array.length; i > index - 1 ; i--) {
                arrayNew[i] = array[i - 1];
            }
            arrayNew[arrayNew.length - 1] = array[array.length - 1];
            arrayNew[index - 1] = number;
            System.out.println("Mảng mới là: " + Arrays.toString(arrayNew));
        } while (index < 0 || index >= array.length);
    }
}
