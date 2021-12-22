import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
            array1[i] = scanner.nextInt(); 
        }

        System.out.println("Nhập vào số lượng phần tử mảng 2:");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + " : ");
            array2[i] = scanner.nextInt();
        }

        System.out.println("Mảng 1 vừa tạo là: ");
        for (int element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Mảng 2 vừa tạo là: ");
        for (int element : array2) {
            System.out.print(element + " ");
        }


        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[i + array1.length] = array2[i];
        }


        System.out.println("New Array " + Arrays.toString(array3));
    }
}
