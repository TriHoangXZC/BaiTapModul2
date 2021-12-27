package BaiTapThemNgay24Thang12.Laptop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LaptopManager laptopManager = new LaptopManager();

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả sản phẩm: ");
            System.out.println("2. Thêm laptop mới: ");
            System.out.println("3. Sửa sản phẩm theo id: ");
            System.out.println("4. Xóa sản phẩm theo id: ");
            System.out.println("5. Hiển thị tất cả sản phẩm của 1 hãng: ");
            System.out.println("6. Tìm kiếm sản phẩm theo khoảng giá: ");
            System.out.println("7. Tìm kiếm sản phẩm theo hãng: ");
            System.out.println("8. Tìm kiếm sản phẩm theo màu sắc: ");
            System.out.println("9. Viết file chứa tên sản phẩm: ");
            System.out.println("10. Đọc file chứa tên sản phẩm: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    laptopManager.displayAllLaptopList();
                    break;
                case 2:
                    try {
                        Laptop laptop = laptopManager.creatLaptop();
                        laptopManager.addLaptop(laptop);
                    } catch (Exception e) {
                        System.out.println("Lỗi!!! Vui lòng nhập lại");
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Nhập id sản phẩm muốn sửa: ");
                        int editID = scanner.nextInt();
                        scanner.nextLine();
                        Laptop laptopEdit = laptopManager.editLaptopById(editID);
                        System.out.println(laptopEdit);
                    } catch (Exception e) {
                        System.out.println("Lỗi!!! Vui lòng nhập lại");
                    }
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
                    System.out.println(laptopManager.searchLaptopListByRangePrice(minPrice, maxPrice));
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
                case 9:
                    try {
                        ArrayList<String> strings = laptopManager.listBrand();
                        laptopManager.writeBrand(strings, "src/BaiTapThemNgay24Thang12/Laptop/brand.txt");
                        System.out.println("Write file successfully!");
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        System.out.println("Read file successfully!");
                        laptopManager.readBrand("src/BaiTapThemNgay24Thang12/Laptop/brand.txt");
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
            }
        } while (choice != 0);
    }
}
