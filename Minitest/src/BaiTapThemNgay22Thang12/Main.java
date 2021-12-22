package BaiTapThemNgay22Thang12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị tất cả người: ");
            System.out.println("2. Hiển thị tất cả nam: ");
            System.out.println("3. Hiển thị tất cả nữ: ");
            System.out.println("4. Hiển thị tất cả người dưới 20 tuổi: ");
            System.out.println("5. Thêm 1 người: ");
            System.out.println("6. Xóa 1 người theo tên: ");
            System.out.println("7. Sửa 1 người theo tên: ");
            System.out.println("8. Hiển thị tất cả người theo tên nhập vào: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    humanManager.displayAllHuman();
                    break;
                case 2:
                    System.out.println(humanManager.displayHumanListGenderMan());
                    break;
                case 3:
                    System.out.println(humanManager.displayHumanListGenderWoman());
                    break;
                case 4:
                    System.out.println(humanManager.displayHumanUnder20Age());
                    break;
                case 5:
                    Human human = humanManager.creatHuman(scanner);
                    humanManager.addHuman(human);
                    break;
                case 6:
                    System.out.println("Nhập tên muốn xóa: ");
                    String nameDelete = scanner.nextLine();
                    System.out.println(humanManager.deleteHumanByName(nameDelete));
                    break;
                case 7:
                    System.out.println("Nhập tên muốn sửa: ");
                    String nameEdit = scanner.nextLine();
                    System.out.println(humanManager.editHumanByName(nameEdit));
                    break;
                case 8:
                    System.out.println("Nhập tên muốn hiển thị tất cả: ");
                    String nameDisplayAll = scanner.nextLine();
                    break;
            }
        } while (choice != 0);
    }
}
