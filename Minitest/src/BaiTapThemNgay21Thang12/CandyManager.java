package BaiTapThemNgay21Thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    private ArrayList<Candy> candyArrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public CandyManager() {
        this.candyArrayList = new ArrayList<>();
    }

    public void displayAllCandy() {
        for (Candy candy : candyArrayList) {
            System.out.println(candy);
        }
    }

    public Candy creatCandy() {
        System.out.println("Nhập màu sắc kẹo: ");
        String color = scanner.nextLine();
        System.out.println("Nhập tính chất kẹo: ");
        String property = scanner.nextLine();
        System.out.println("Nhập số lượng kẹo: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhập đơn giá kẹo: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        return new Candy(color, property, quantity, amount);
    }

    public void addCandy(Candy candy) {
        candyArrayList.add(candy);
    }

    public Candy deleteCandyById(int id) {
        Candy candy = null;
        for (Candy c : candyArrayList) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        int index = candyArrayList.indexOf(candy);
        return candyArrayList.remove(index);
    }

    public Candy editCandyById(int id) {
        Candy candy = null;
        for (Candy c : candyArrayList) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        if (candy != null) {
            int index = candyArrayList.indexOf(candy);
            System.out.println("Nhập màu mới: ");
            String color = scanner.nextLine();
            candy.setColor(color);
            System.out.println("Nhập tính chất mới:");
            String property = scanner.nextLine();
            candy.setProperty(property);
            System.out.println("Nhập số lượng mới: ");
            int quantity = scanner.nextInt();
            candy.setQuantity(quantity);
            System.out.println("Nhập đơn giá mới: ");
            double amount = scanner.nextDouble();
            candy.setAmount(amount);
            candyArrayList.set(index, candy);
        }
        return candy;
    }

    public void displayCandyById(int id) {
        Candy candy = null;
        for (Candy c : candyArrayList) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        if (candy != null) {
            System.out.println(candy);
        } else {
            System.out.println("Không có viên kẹo có id tương ứng!");
        }
    }

    public ArrayList<Candy> deleteCandyListByColor(String color) {
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c : candyArrayList) {
            if (c.getColor().equals(color)) {
                candy.add(c);
            }
        }
        candyArrayList.removeAll(candy);
        return candy;
    }

    public ArrayList<Candy> displayCandyListByColor(String color) {
        ArrayList<Candy> candy = new ArrayList<>();
        for (Candy c : candyArrayList) {
            if (c.getColor().equals(color)) {
                candy.add(c);
            }
        }
        return candy;
    }

    public ArrayList<Candy> searchByPrice() {
        ArrayList<Candy> candy = new ArrayList<>();
        double max = candyArrayList.get(0).getAmount();
        for (Candy c : candyArrayList) {
            if (max < c.getAmount()) {
                max = c.getAmount();
            }
        }
        for (Candy c : candyArrayList) {
            if (c.getAmount() == max) {
                candy.add(c);
            }
        }
        return candy;
    }

    public void displayCandyListAndTotalPrice() {
        for (Candy c : candyArrayList) {
            System.out.println(c.getId() + "---" + (c.getAmount() * c.getQuantity()));
        }
    }
}
