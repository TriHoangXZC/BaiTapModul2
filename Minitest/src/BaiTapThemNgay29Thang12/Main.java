package BaiTapThemNgay29Thang12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm 1 sinh viên: ");
            System.out.println("2. Xóa 1 sinh viên theo tên: ");
            System.out.println("3. Sửa 1 sinh viên theo tên: ");
            System.out.println("4. Hiển thị tất cả sinh viên: ");
            System.out.println("5. Hiển thị tất cả sinh viên có điểm trung bình trên 7.5: ");
            System.out.println("6. Hiển thị tất cả sinh viên theo cú pháp: ");
            System.out.println("7. Ghi ra file CSV: ");
            System.out.println("8. Đọc file CSV: ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên muốn xóa: ");
                    String nameDelete = scanner.nextLine();
                    System.out.println(studentManager.deleteStudentByName(nameDelete));
                    break;
                case 3:
                    System.out.println("Nhập tên sinh viên muốn sửa: ");
                    String nameEdit = scanner.nextLine();
                    System.out.println(studentManager.editStudentByName(nameEdit));
                    break;
                case 4:
                    studentManager.displayAllStudent();
                    break;
                case 5:
                    studentManager.displayAllStudentAvgPointHigherThanSevenDotFive();
                    break;
                case 6:
                    studentManager.displayStudentFormat();
                    break;
                case 7:
                    studentManager.writeFile(studentManager.getStudentArrayList(), StudentManager.PATH_NAME);
                    break;
                case 8:
                    ArrayList<Student> studentArrayList = studentManager.readFile(StudentManager.PATH_NAME);
                    studentArrayList.forEach(System.out::println);
                    break;
            }
        } while (choice != 0);
    }
}
