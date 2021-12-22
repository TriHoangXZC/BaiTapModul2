import java.util.Scanner;

public class SumAColumnOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int arrayRow = scanner.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int arrayColumn = scanner.nextInt();
        int[][] array = new int[arrayRow][arrayColumn];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập giá trị phần tử hàng " + (i + 1) + " cột " + (j + 1));
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Nhập vào cột muốn tính tổng: ");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if(array[i][j] == array[i][col - 1]){
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử trong cột " + col + " = " + sum);
    }
}
