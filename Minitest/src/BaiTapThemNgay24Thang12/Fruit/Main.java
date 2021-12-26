package BaiTapThemNgay24Thang12.Fruit;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả loại quả: ");
            System.out.println("2. Hiển thị tất cả các quả theo loại: ");
            System.out.println("3. Hiển thị quả có đơn giá cao nhất: ");
            System.out.println("4. Hiển thị quả mua được nhiều nhất với 1000000: ");
            System.out.println("5. Thêm quả vào list theo tên: ");
            System.out.println("6. Xóa quả khỏi list theo tên: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    fruitManager.displayAllFruit();
                    break;
                case 2:
                    System.out.println("Nhập vào loại quả muốn hiển thị: ");
                    String kind = scanner.nextLine();
                    System.out.println(fruitManager.displayByKind(kind));
                    break;
                case 3:
                    System.out.println(fruitManager.displayMaxPriceFruit());
                    break;
                case 4:
                    System.out.println(fruitManager.displayMinPriceFruit());
                    break;
                case 5:
                    Fruit fruit = fruitManager.creatFruit();
                    fruitManager.addFruit(fruit);
                    break;
                case 6:
                    System.out.println("Nhập tên loại quả muốn xóa: ");
                    String deleteKind = scanner.nextLine();
                    System.out.println(fruitManager.deleteByKind(deleteKind));
                    break;

            }
        } while (choice != 0);
    }
}
