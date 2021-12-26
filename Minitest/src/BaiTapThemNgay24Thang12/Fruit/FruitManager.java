package BaiTapThemNgay24Thang12.Fruit;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitManager {
    ArrayList<Fruit> fruitArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public FruitManager() {
        this.fruitArrayList = new ArrayList<>();
    }

    public Fruit creatFruit() {
        System.out.println("Nhập loại quả: ");
        String kind = scanner.nextLine();
        System.out.println("Nhập cân nặng: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập vị: ");
        String taste = scanner.nextLine();
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        return new Fruit(kind, weight, taste, color, price);

    }

    public void addFruit(Fruit fruit){
        fruitArrayList.add(fruit);
    }

    public void displayAllFruit() {
        for (Fruit fruit : fruitArrayList) {
            System.out.println(fruit);
        }
    }

    public ArrayList<Fruit> displayByKind(String kind) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        for (Fruit fruit : fruitArrayList) {
            if (fruit.getKind().equals(kind)) {
                fruits.add(fruit);
            }
        }
        return fruits;
    }

    public ArrayList<Fruit> displayMaxPriceFruit() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        double maxPrice = fruitArrayList.get(0).getPrice();
        for (Fruit f : fruitArrayList) {
            if (maxPrice < f.getPrice()) {
                maxPrice = f.getPrice();
            }
        }
        for (Fruit f : fruitArrayList) {
            if (maxPrice == f.getPrice()) {
                fruits.add(f);
            }
        }
        return fruits;
    }

    public ArrayList<Fruit> displayMinPriceFruit() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        double minPrice = fruitArrayList.get(0).getPrice();
        for (Fruit f : fruitArrayList) {
            if (minPrice > f.getPrice()) {
                minPrice = f.getPrice();
            }
        }
        for (Fruit f : fruitArrayList) {
            if (minPrice == f.getPrice()) {
                fruits.add(f);
            }
        }
        return fruits;
    }

    public ArrayList<Fruit> deleteByKind(String kind){
        ArrayList<Fruit> fruits = new ArrayList<>();
        for (Fruit fruit : fruitArrayList) {
            if (fruit.getKind().equals(kind)) {
                fruits.add(fruit);
            }
        }
        fruitArrayList.removeAll(fruits);
        return fruits;
    }
}
