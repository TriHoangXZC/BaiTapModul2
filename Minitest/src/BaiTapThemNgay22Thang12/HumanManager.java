package BaiTapThemNgay22Thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    private ArrayList<Human> humanArrayList;
    private Scanner scanner = new Scanner(System.in);

    public HumanManager() {
        this.humanArrayList = new ArrayList<>();
    }

    public void displayAllHuman() {
        for (Human human : humanArrayList) {
            System.out.println(human);
        }
    }

    public Human creatHuman(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        return new Human(name, age, gender, address);
    }

    public void addHuman(Human human){
        humanArrayList.add(human);
    }

    public ArrayList<Human> displayHumanListGenderMan() {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humanArrayList) {
            if (h.getGender().equals("Nam")) {
                human.add(h);
            }
        }
        return human;
    }

    public ArrayList<Human> displayHumanListGenderWoman() {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humanArrayList) {
            if (h.getGender().equals("Nữ")) {
                human.add(h);
            }
        }
        return human;
    }

    public ArrayList<Human> displayHumanUnder20Age() {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humanArrayList) {
            if (h.getAge() < 20) {
                human.add(h);
            }
        }
        return human;
    }

    public Human deleteHumanByName(String name) {
        Human human = null;
        for (Human h : humanArrayList) {
            if (h.getName().equals(name)) {
                human = h;
            }
        }
        humanArrayList.remove(human);
        return human;
    }

    public Human editHumanByName(String name) {
        Human humanupdate = null;
        for (Human human : humanArrayList) {
            if(human.getName().equals(name)){
                humanupdate = human;
            }
        }
        if(humanupdate != null){
            scanner.nextLine();
            System.out.println("Nhập tên mới: ");
            String name1 = scanner.nextLine();
            humanupdate.setName(name1);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            humanupdate.setAge(age);
            scanner.nextLine();
            System.out.println("Nhập giới tính mới: ");
            String gender = scanner.nextLine();
            humanupdate.setGender(gender);
            System.out.println("Nhập địa chỉ mới: ");
            String address = scanner.nextLine();
            humanupdate.setAddress(address);
            return humanupdate;
        }
        return null;
    }

}
