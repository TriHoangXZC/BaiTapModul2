package SuDungLopArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] array = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + array[x]);
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
