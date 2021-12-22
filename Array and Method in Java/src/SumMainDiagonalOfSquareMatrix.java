import java.util.Scanner;

public class SumMainDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng vuông: ");
        int size = scanner.nextInt();

        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Phần tử thứ [" + i + "][" + j + "] là :");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa tạo là: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        double sumLeft = 0;
        double sumRight = 0;
        for (int i = 0; i < size; i++) {
            sumLeft += array[i][i];
        }

        for (int i = 0; i < size; i++) {
            sumRight += array[i][size - i - 1];
        }
        System.out.println("Tổng đường chéo chính là: " + (sumLeft + sumRight));
    }
}
