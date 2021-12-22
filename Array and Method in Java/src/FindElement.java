import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng thành viên: ");
        int size = scanner.nextInt();
        String[] student = new String[size];
        scanner.nextLine();
        for (int i = 0; i < student.length; i++) {
            System.out.println("Nhập tên học sinh thứ " + (i + 1) + " : ");
            student[i] = scanner.nextLine();
        }
        System.out.println("Danh sách thành viên là: ");
        for (int i = 0; i < student.length; i++) {
            System.out.print(student[i] + " ");
        }
        System.out.println();

        System.out.println("Nhập tên học sinh cần tìm: ");
        String studentName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(studentName)) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Học sinh " + studentName + " có trong danh sách");
        } else {
            System.out.println("Học sinh " + studentName + " không có tên trong danh sách");
        }
    }
}
