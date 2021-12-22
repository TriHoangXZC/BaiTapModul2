package BaiTapThemNgay21Thang12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CandyManager candyManager = new CandyManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị tất cả kẹo có trong list");
            System.out.println("2. Thêm 1 viên kẹo vào list");
            System.out.println("3. Xóa 1 viên kẹo theo id");
            System.out.println("4. Sửa 1 viên kẹo theo id");
            System.out.println("5. Hiển thị viên kẹo theo id");
            System.out.println("6. Xóa tất cả các viên kẹo có màu được nhập từ bàn phím");
            System.out.println("7. Hiển thị tất cả các viên kẹo có màu được nhập từ bàn phím ");
            System.out.println("8. Tìm viên kèo có đơn giá cao nhất");
            System.out.println("9. Tính giá thành của kẹo và hiển thị dưới dạng: tên - giá thành");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    candyManager.displayCandyArrayList();
                    break;
                case 2:
                    Candy candy = candyManager.creatCandy(scanner);
                    candyManager.addCandy(candy);
                    break;
                case 3:
                    System.out.println("Nhập id viên kẹo muốn xóa: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(candyManager.deleteById(idDelete));
                    break;
                case 4:
                    System.out.println("Nhập id viên kẹo muốn sửa: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(candyManager.editById(idEdit));
                    break;
                case 5:
                    System.out.println("Nhập id viên kẹo muốn hiển thị: ");
                    int idDisplay = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(candyManager.searchById(idDisplay));
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Nhập màu các viên kẹo muốn xóa: ");
                    String colorDelete = scanner.nextLine();
                    System.out.println(candyManager.deleteCandyByColor(colorDelete));
                    break;
                case 7:
                    scanner.nextLine();
                    System.out.println("Nhập màu các viên kẹo muốn hiển thị: ");
                    String colorDisplay = scanner.nextLine();
                    System.out.println(candyManager.displayCandyByColor(colorDisplay));
                    break;
                case 8:
                    System.out.println("Viên kẹo có giá cao nhất: ");
                    break;
                case 9:
                    System.out.println("Tính giá thành của các viên kẹo theo dạng: tên - giá");
                    break;

            }
        } while (choice != 0);
    }
}
