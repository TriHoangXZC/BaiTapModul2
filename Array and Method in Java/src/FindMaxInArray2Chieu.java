import java.util.Scanner;

public class FindMaxInArray2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int arrayRow = scanner.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int arrayColumn = scanner.nextInt();

//Cách 1: Không tách phương thức
//        int[][] array = new int[arrayRow][arrayColumn];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.println("Enter element column " + (i + 1) + " row " + (j + 1));
//                array[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println("Mảng vừa tạo là: ");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//        System.out.println();
//        }
//        int max = array[0][0];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (max < array[i][j]) {
//                    max = array[i][j];
//                }
//            }
//        }
//        System.out.println("Max là: " + max);
//    }

//Cách 2: Tách phương thức:
        int[][] array = setArr(arrayRow, arrayColumn);
        int max = findMaxArray2Chieu(array);
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }

    public static int findMaxArray2Chieu(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    public static int[][] setArr(int row, int col) {
        Scanner input = new Scanner(System.in);
        int[][] arr =  new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhập phần tử hàng " + (i + 1) + " cột " + (j + 1));
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
