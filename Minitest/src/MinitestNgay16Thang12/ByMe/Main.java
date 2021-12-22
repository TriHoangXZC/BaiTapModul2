package MinitestNgay16Thang12.ByMe;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> personArrayList = new ArrayList<>();
        PersonManager personManager = new PersonManager(personArrayList);
        String name;
        int age;
        double avgPoint;

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả");
            System.out.println("2. Thêm 1 người vào danh sách");
            System.out.println("3. Tìm vị trí 1 người theo id");
            System.out.println("4. Xóa 1 người trong danh sách theo id");
            System.out.println("5. Sửa 1 người trong danh sách theo id");
            System.out.println("6. Sắp xếp danh sách theo điểm trung bình");
            System.out.println("7. Tính tổng điểm");
            System.out.println("8. Tính điểm trung bình của tất cả học sinh");
            System.out.println("0. Exit");
            System.out.println(" Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    personManager.displayPerson(personArrayList);
                    break;
                case 2:
                    int choice1;
                    do {
                        System.out.println("Menu");
                        System.out.println("1. Person");
                        System.out.println("2. Student");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                scanner.nextLine();
                                System.out.println("Nhập tên: ");
                                name = scanner.nextLine();
                                System.out.println("Nhập tuổi");
                                age = scanner.nextInt();
                                Person person = new Person(name, age);
                                personManager.addPerson(personArrayList, person);
                                break;
                            case 2:
                                scanner.nextLine();
                                System.out.println("Nhập tên: ");
                                name = scanner.nextLine();
                                System.out.println("Nhập tuổi");
                                age = scanner.nextInt();
                                System.out.println("Nhập điểm trung bình: ");
                                avgPoint = scanner.nextDouble();
                                Student student = new Student(name, age, avgPoint);
                                personManager.addPerson(personArrayList, student);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 3:
                    System.out.println("Nhập id muốn tìm: ");
                    int idSearch = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(personManager.searchById(personArrayList, idSearch));
                    break;
                case 4:
                    System.out.println("Nhập id người muốn xóa: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    personManager.deletePersonById(personArrayList, idDelete);
                    System.out.println(personArrayList);
                    break;
                case 5:
                    System.out.println("Nhập id người muốn sửa: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(personManager.editInformationById(personArrayList, idEdit));
                case 6:
                    personManager.sortByAveragePoint(personArrayList);
                    System.out.println(personArrayList);
                    break;
                case 7:
                    System.out.println("Tổng điểm là: ");
                    System.out.println(personManager.totalAveragePoint(personArrayList));
                    break;
                case 8:
                    System.out.println("Trung bình điểm là: ");
                    System.out.println(personManager.totalAverage(personArrayList));
                    break;

            }
        } while (choice != 0);
    }

}
