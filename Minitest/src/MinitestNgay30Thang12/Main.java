package MinitestNgay30Thang12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Hiển thị tất cả danh sách: ");
            System.out.println("2. Thêm sinh viên: ");
            System.out.println("3. Sửa sinh viên theo ID: ");
            System.out.println("4. Xóa sinh viên theo ID: ");
            System.out.println("5. Tìm kiếm sinh viên theo ID: ");
            System.out.println("6. In ra danh sách sắp xếp theo điểm trung bình tăng dần: ");
            System.out.println("7. In ra danh sách sắp xếp theo điểm trung bình giảm dần: ");
            System.out.println("8. Tìm sinh viên có điểm cao nhất: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.displayAllStudent();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    System.out.println("Nhập ID sinh viên muốn sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.editStudentById(editId));
                    break;
                case 4:
                    System.out.println("Nhập ID sinh viên muốn xóa: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.deleteStudentById(deleteId));
                    break;
                case 5:
                    System.out.println("Nhập ID sinh viên muốn tìm: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManager.searchStudentById(searchId));
                    break;
                case 6:
                    studentManager.sortByAvgPointAscending().forEach(System.out::println);
                    break;
                case 7:
                    studentManager.sortByAvgPointDecrease().forEach(System.out::println);
                    break;
                case 8:
                    System.out.println(studentManager.getStudentMaxPoint());
                    break;
            }
        } while (choice != 0);
    }
}
