import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Nhập vào số lượng phần tử: ");
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
        System.out.println("Nhập giá trị muốn xóa: ");
        int number = scanner.nextInt();
        int count = 0;
        boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                check = true;
                count++;
                System.out.println("Vị trí giá trị muốn xóa là: " + i);
            }
        }
        if (!check) {
            System.out.println("Giá trị muốn xóa không nằm trong mảng");
        }

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != number) {
                array[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < count; i++) {
            for (int j = array.length - count; j < array.length; j++) {
                array[j] = 0;
            }
        }
        System.out.println("Mảng còn lại sau khi xóa giá trị " + number + " là: ");
        for (int element : array) {
            System.out.print(element);
        }
    }
}
