package BaiTapThemNgay24Thang12.Fruit;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả loại quả: ");
            System.out.println("2. Hiển thị tất cả các quả táo: ");
            System.out.println("3. Hiển thị tất cả các quả chuối: ");
            System.out.println("4. Hiển thị tất cả các quả chanh: ");
            System.out.println("5. Hiển thị quả có đơn giá cao nhất: ");
            System.out.println("6. Hiển thị quả mua được nhiều nhất với 1000000: ");
            System.out.println("7. Thêm quả vào list theo tên: ");
            System.out.println("8. Xóa quả khỏi list theo giá: ");
            System.out.println("9. Ghi vào file CSV: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    fruitManager.displayAllFruit();
                    break;
                case 2:
                    fruitManager.displayAppleList();
                    break;
                case 3:
                    fruitManager.displayBananaList();
                    break;
                case 4:
                    fruitManager.displayLemonList();
                    break;
                case 5:
                    System.out.println(fruitManager.displayMaxPriceFruit());
                    break;
                case 6:
                    System.out.println(fruitManager.displayMinPriceFruit());
                    break;
                case 7:
                    int choice1;
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Thêm táo");
                        System.out.println("2. Thêm chuối");
                        System.out.println("3. Thêm chanh");
                        System.out.println("0. Quay lại Menu");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        scanner.nextLine();
                        switch (choice1) {
                            case 1:
                                Apple apple = (Apple) fruitManager.creatFruit(choice1);
                                fruitManager.addFruit(apple);
                                break;
                            case 2:
                                Banana banana = (Banana) fruitManager.creatFruit(choice1);
                            fruitManager.addFruit(banana);
                                break;
                            case 3:
                                Lemon lemon = (Lemon) fruitManager.creatFruit(choice1);
                                fruitManager.addFruit(lemon);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 8:
                    System.out.println("Nhập giá loại quả muốn xóa: ");
                    double deletePrice = scanner.nextDouble();
                    System.out.println(fruitManager.deleteByPrice(deletePrice));
                    break;
                case 9:
                    fruitManager.exportCsv();
                    break;
            }
        } while (choice != 0);
    }
}
