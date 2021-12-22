package BaiTapThemNgay21Thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CandyManager candyManager = new CandyManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả kẹo");
            System.out.println("2. Thêm kẹo");
            System.out.println("3. Xóa kẹo theo id");
            System.out.println("4. Sửa kẹo theo id");
            System.out.println("5. Hiển thị kẹo theo id");
            System.out.println("6. Xóa tất cả kẹo có cùng màu nhập vào");
            System.out.println("7. Hiển thị tất cả kẹo có cùng màu nhập vào");
            System.out.println("8. Hiển thị tất cả kẹo có đơn giá cao nhất");
            System.out.println("9. Hiển thị tất cả kẹo và tổng giá của nó");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    candyManager.displayAllCandy();
                    break;
                case 2:
                    Candy candy = candyManager.creatCandy();
                    candyManager.addCandy(candy);
                    break;
                case 3:
                    System.out.println("Nhập vào id bạn muốn: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Candy candy1 = candyManager.deleteCandyById(idDelete);
                    if (candy1 == null) {
                        System.out.println("Không có kẹo có id tương ứng!");
                    } else {
                        System.out.println(candy1);
                    }
                    break;
                case 4:
                    System.out.println("Nhập vào id bạn muốn: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(candyManager.editCandyById(idEdit));
                    break;
                case 5:
                    System.out.println("Nhập vào id bạn muốn: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    candyManager.displayCandyById(id);
                    break;
                case 6:
                    System.out.println("Nhập màu muốn xóa: ");
                    scanner.nextLine();
                    String colorDelete = scanner.nextLine();
                    ArrayList<Candy> arrayList1 = candyManager.deleteCandyListByColor(colorDelete);
                    System.out.println(arrayList1);
                    break;
                case 7:
                    System.out.println("Nhập màu muốn hiển thị: ");
                    scanner.nextLine();
                    String color = scanner.nextLine();
                    ArrayList<Candy> arrayList2 = candyManager.displayCandyListByColor(color);
                    System.out.println(arrayList2);
                    break;
                case 8:
                    ArrayList<Candy> arrayList3 = candyManager.searchByPrice();
                    System.out.println(arrayList3);
                    break;
                case 9:
                    candyManager.displayCandyListAndTotalPrice();
                    break;
            }
        } while (choice != 0);
    }
}
