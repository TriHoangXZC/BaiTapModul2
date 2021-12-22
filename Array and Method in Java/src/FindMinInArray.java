import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
//        int[]  array = {4, 12, 7, 8, 1, 6, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int elemnt : array) {
            System.out.print(elemnt + " ");
        }

        System.out.println();

        System.out.println("Số bé nhất trong mảng là: " + minValue(array));
    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
