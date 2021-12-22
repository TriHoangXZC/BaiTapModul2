package BaiTapThemNgay21Thang12;

import javafx.scene.canvas.Canvas;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    private ArrayList<Candy> candyArrayList;
    private final Scanner scanner = new Scanner(System.in);


    public CandyManager() {
        this.candyArrayList = new ArrayList<>();
    }

    public void addCandy(Candy candy) {
        candyArrayList.add(candy);
    }

    public Candy creatCandy(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập màu sắc: ");
        String color = scanner.nextLine();
        System.out.println("Nhập tính chất: ");
        String nature = scanner.nextLine();
        System.out.println("Nhập số lượng: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhập đơn giá: ");
        double price = scanner.nextInt();
        return new Candy(color, nature, quantity, price);
    }

    public void displayCandyArrayList() {
        for (Candy candy : candyArrayList) {
            System.out.println(candy);
        }
    }

    public Candy deleteById(int id) {
        Candy candy = null;
        for (Candy c : candyArrayList) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        candyArrayList.remove(candy);
        return candy;
    }

    public Candy editById(int id) {
        Candy candyUpdate = null;
        for (Candy candy : candyArrayList) {
            if (candy.getId() == id) {
                candyUpdate = candy;
            }
        }
        if (candyUpdate != null) {
            System.out.println("Nhập màu mới: ");
            String color = scanner.nextLine();
            if (color.equals("")) {
                candyUpdate.setColor(candyUpdate.getColor());
            } else {
                candyUpdate.setColor(color);
            }
            System.out.println("Nhập tính chất mới: ");
            String nature = scanner.nextLine();
            candyUpdate.setNature(nature);
            System.out.println("Nhập số lượng: ");
            int quantity = scanner.nextInt();
            candyUpdate.setQuantity(quantity);
            System.out.println("Nhập đơn giá mới: ");
            double price = scanner.nextDouble();
            candyUpdate.setPrice(price);
            return candyUpdate;
        }
        return null;
    }

    public Candy searchById(int id) {
        for (Candy candy : candyArrayList) {
            if (candy.getId() == id) {
                return candy;
            }
        }
        return null;
    }

    public ArrayList<Candy> deleteCandyByColor(String color) {
        ArrayList<Candy> candies = new ArrayList<>();
        for (Candy candy : candyArrayList) {
            if (candy.getColor().equals("color")) {
                candies.add(candy);
                candyArrayList.remove(candy);
            }
        }
        return candies;
    }


    public ArrayList<Candy> displayCandyByColor(String color) {
        ArrayList<Candy> candies = new ArrayList<>();
        for (Candy candy : candyArrayList) {
            if (candy.getColor().equals("color")) {
                candies.add(candy);
            }
        }
        return candies;
    }


}
