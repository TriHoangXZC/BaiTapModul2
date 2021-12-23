package MinitestNgay23Thang12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do{
            System.out.println("Menu: ");
            System.out.println("1. Hiển thị tất cả: ");
            System.out.println("2. Thêm 1 người: ");
            System.out.println("3. Sửa 1 người theo id: ");
            System.out.println("4. Xóa 1 người theo id: ");
            System.out.println("5. Tìm kiếm 1 người theo id: ");
            System.out.println("6. Sắp xếp list theo điểm trung bình: ");
            System.out.println("7. Sinh viên có điểm cao nhất: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    personManager.displayAll();
                    break;
                case 2:
                    int choice1;
                    do{
                        System.out.println("1. Người");
                        System.out.println("2. Sinh viên");
                        System.out.println("0. Exit");
                        System.out.println("Nhập lựa chọn của bạn: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Person person = personManager.creatPerson(scanner, choice1);
                                personManager.addPerson(person);
                                break;
                            case 2:
                                Student student = (Student) personManager.creatPerson(scanner,choice1);
                                personManager.addPerson(student);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 3:
                    System.out.println("Nhập id người muốn sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(personManager.editById(editId));
                    break;
                case 4:
                    System.out.println("Nhập id người muốn xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(personManager.deleteById(deleteId));
                    break;
                case 5:
                    System.out.println("Nhập id người muốn tìm kiếm: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(personManager.searchById(searchId));
                    break;
                case 6:
                    personManager.sortByAveragePoint();
                    break;
                case 7:
                    break;
            }
        } while (choice != 0);
    }
}
