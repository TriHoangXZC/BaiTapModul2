package BaiTapThemNgay24Thang12.Laptop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaptopManager laptopManager = new LaptopManager();

        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sản phẩm: ");
            System.out.println("2. Thêm laptop mới: ");
            System.out.println("3. Sửa sản phẩm theo id: ");
            System.out.println("4. Xóa sản phẩm theo id: ");
            System.out.println("5. Hiển thị tất cả sản phẩm của 1 hãng: ");
            System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá: ");
            System.out.println("7. Tìm kiếm sản phẩm theo hãng: ");
            System.out.println("8. Tìm kiếm sản phẩm theo màu sắc: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    laptopManager.displayAllLaptopList();
                    break;
                case 2:
                    Laptop laptop = laptopManager.creatLaptop();
                    laptopManager.addLaptop(laptop);
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm muốn sửa: ");
                    int editID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(laptopManager.editLaptopById(editID));
                    break;
                case 4:
                    System.out.println("Nhập id sản phẩm muốn xóa: ");
                    int deleteID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(laptopManager.deleteLaptopById(deleteID));
                    break;
                case 5:
                    System.out.println("Nhập tên hãng muốn hiển thị tất cả sản phẩm: ");
                    String brandName = scanner.nextLine();
                    System.out.println(laptopManager.displayAllLaptopOfBrand(brandName));
                    break;
                case 6:
                    System.out.println("Nhập giá min: ");
                    double minPrice = scanner.nextDouble();
                    System.out.println("Nhập giá max: ");
                    double maxPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(laptopManager.searchLaptopListByRangePrice(minPrice,maxPrice));
                    break;
                case 7:
                    System.out.println("Nhập tên hãng muốn tìm kiếm: ");
                    String brandName1 = scanner.nextLine();
                    System.out.println(laptopManager.searchLaptopListByBrand(brandName1));
                    break;
                case 8:
                    System.out.println("Nhập màu sắc muốn tìm kiếm: ");
                    String color = scanner.nextLine();
                    System.out.println(laptopManager.searchLaptopListByColor(color));
                    break;
            }
        } while (choice != 0);
    }
}
