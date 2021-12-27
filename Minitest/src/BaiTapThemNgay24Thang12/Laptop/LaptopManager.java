package BaiTapThemNgay24Thang12.Laptop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Laptop> laptopArrayList = new ArrayList<>();

    public LaptopManager() {
        this.laptopArrayList = new ArrayList<>();
    }

    public Laptop creatLaptop() {
        System.out.println("Nhập tên hãng: ");
        String brand = scanner.nextLine();
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Nhập giá tiền: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        return new Laptop(brand, color, price, quantity);
    }

    public void addLaptop(Laptop laptop) {
        laptopArrayList.add(laptop);
    }

    public void displayAllLaptopList() {
        for (Laptop laptop : laptopArrayList) {
            System.out.println(laptop);
        }
    }

    public Laptop editLaptopById(int id) {
        Laptop laptopUpdate = null;
        for (Laptop laptop : laptopArrayList) {
            if (laptop.getId() == id) {
                laptopUpdate = laptop;
            }
        }
        if (laptopUpdate != null) {
            int index = laptopArrayList.indexOf(laptopUpdate);
            System.out.println("Nhập hãng mới: ");
            String newBrand = scanner.nextLine();
            laptopUpdate.setBrand(newBrand);
            System.out.println("Nhập màu mới: ");
            String newColor = scanner.nextLine();
            laptopUpdate.setColor(newColor);
            System.out.println("Nhập giá mới: ");
            double newPrice = scanner.nextDouble();
            laptopUpdate.setPrice(newPrice);
            System.out.println("Nhập số lượng mới: ");
            int newQuantity = scanner.nextInt();
            laptopUpdate.setQuantity(newQuantity);
            laptopArrayList.set(index, laptopUpdate);
        }
        return laptopUpdate;
    }

    public Laptop deleteLaptopById(int id) {
        Laptop laptop = null;
        for (Laptop l : laptopArrayList) {
            if (l.getId() == id) {
                laptop = l;
            }
        }
        if (laptop != null) {
            laptopArrayList.remove(laptop);
        }
        return laptop;
    }

    public ArrayList<Laptop> displayAllLaptopOfBrand(String brand) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        for (Laptop laptop : laptopArrayList) {
            if (laptop.getBrand().equals(brand)) {
                laptops.add(laptop);
            }
        }
        return laptops;
    }

    public ArrayList<Laptop> searchLaptopListByBrand(String brand) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        for (Laptop laptop : laptopArrayList) {
            if (laptop.getBrand().equals(brand)) {
                laptops.add(laptop);
            }
        }
        return laptops;
    }

    public ArrayList<Laptop> searchLaptopListByColor(String color) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        for (Laptop laptop : laptopArrayList) {
            if (laptop.getColor().equals(color)) {
                laptops.add(laptop);
            }
        }
        return laptops;
    }

    public ArrayList<Laptop> searchLaptopListByRangePrice(double minPrice, double maxPrice) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        for (Laptop laptop : laptopArrayList) {
            if (laptop.getPrice() >= minPrice && laptop.getPrice() <= maxPrice) {
                laptops.add(laptop);
            }
        }
        return laptops;
    }

    public ArrayList<String> listBrand() {
        ArrayList<String> strings = new ArrayList<>();
        for (Laptop laptop : laptopArrayList) {
            strings.add(laptop.getBrand());
        }
        return strings;
    }

    public void writeBrand(ArrayList<String> brandList, String pathName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
        for (String string : brandList) {
            bufferedWriter.write(string + "\n");
        }
        bufferedWriter.close();
    }

    public void readBrand(String pathName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
        String line;
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
