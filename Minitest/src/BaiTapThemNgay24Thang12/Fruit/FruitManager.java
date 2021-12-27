package BaiTapThemNgay24Thang12.Fruit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FruitManager {
    ArrayList<Fruit> fruitArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public FruitManager() {
        this.fruitArrayList = new ArrayList<>();
    }

    public Fruit creatFruit(int choice) {
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
        if (choice == 1) {
            return new Apple(weight, taste, color, price);
        } else if (choice == 2) {
            return new Banana(weight, taste, color, price);
        } else if (choice == 3) {
            return new Lemon(weight, taste, color, price);
        }
        return null;
    }

    public void addFruit(Fruit fruit) {
        fruitArrayList.add(fruit);
    }

    public void displayAllFruit() {
        for (Fruit fruit : fruitArrayList) {
            System.out.println(fruit);
        }
    }

    public void displayAppleList() {
        for (Fruit fruit : fruitArrayList) {
            if (fruit instanceof Apple) {
                System.out.println(fruit);
            }
        }
    }

    public void displayBananaList() {
        for (Fruit fruit : fruitArrayList) {
            if (fruit instanceof Banana) {
                System.out.println(fruit);
            }
        }
    }

    public void displayLemonList() {
        for (Fruit fruit : fruitArrayList) {
            if (fruit instanceof Lemon) {
                System.out.println(fruit);
            }
        }
    }

    public ArrayList<Fruit> displayMaxPriceFruit() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        double maxPrice = fruitArrayList.get(0).getPrice();
        for (Fruit fruit : fruitArrayList) {
            if (maxPrice < fruit.getPrice()) {
                maxPrice = fruit.getPrice();
            }
        }
        for (Fruit fruit : fruitArrayList) {
            if (maxPrice == fruit.getPrice()) {
                fruits.add(fruit);
            }
        }
        return fruits;
    }

    public ArrayList<Fruit> displayMinPriceFruit() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        double minPrice = fruitArrayList.get(0).getPrice();
        for (Fruit fruit : fruitArrayList) {
            if (minPrice > fruit.getPrice()) {
                minPrice = fruit.getPrice();
            }
        }
        for (Fruit fruit : fruitArrayList) {
            if (minPrice == fruit.getPrice()) {
                fruits.add(fruit);
            }
        }
        return fruits;
    }

    public ArrayList<Fruit> deleteByPrice(double price) {
        ArrayList<Fruit> fruits = new ArrayList<>();
        for (Fruit fruit : fruitArrayList) {
            if (fruit.getPrice() == price) {
                fruits.add(fruit);
            }
        }
        fruitArrayList.removeAll(fruits);
        return fruits;
    }

    public void exportCsv() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(String.format("src/BaiTapThemNgay24Thang12/Fruit/test_%s.csv", new Date().getTime())))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Weight,");
            sb.append("Taste,");
            sb.append("Color,");
            sb.append("Price");
            sb.append('\n');

            if (fruitArrayList.size() > 0) {
                for (Fruit fruit : fruitArrayList) {
                    sb.append(fruit.getWeight());
                    sb.append(',');
                    sb.append(fruit.getTaste());
                    sb.append(',');
                    sb.append(fruit.getColor());
                    sb.append(',');
                    sb.append(fruit.getPrice());
                    sb.append('\n');
                }
            }
            bufferedWriter.write(sb.toString());
            System.out.println("Write successfully");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
