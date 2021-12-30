package MinitestNgay30Thang12;


import java.util.ArrayList;
import java.util.Scanner;


public class StudentManager {

    private final ArrayList<Student> studentArrayList;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.studentArrayList = new ArrayList<>();
    }

    public void addStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập điểm Toán: ");
        double mathP = scanner.nextDouble();
        System.out.println("Nhập điểm Lý: ");
        double physicP = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa: ");
        double chemistryP = scanner.nextDouble();
        scanner.nextLine();
        studentArrayList.add(new Student(name, age, mathP, physicP, chemistryP));
    }

    public void displayAllStudent() {
        if (studentArrayList.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (Student student : studentArrayList) {
            System.out.println(student);
        }

    }

    public Student deleteStudentById(int id) {
        Student student = null;
        for (Student s : studentArrayList) {
            if (s.getId() == id) {
                student = s;
            }
        }
        if (student != null) {
            studentArrayList.remove(student);
        }
        return student;
    }

    public Student editStudentById(int id) {
        Student studentEdit = null;
        for (Student s : studentArrayList) {
            if (s.getId() == id) {
                studentEdit = s;
            }
        }
        if (studentEdit != null) {
            int index = studentArrayList.indexOf(studentEdit);
            System.out.println("Nhập tên mới: ");
            String newName = scanner.nextLine();
            studentEdit.setName(newName);
            System.out.println("Nhập tuổi mới: ");
            int newAge = scanner.nextInt();
            studentEdit.setAge(newAge);
            System.out.println("Nhập điểm Toán mới: ");
            double newMathP = scanner.nextDouble();
            studentEdit.setMathPoint(newMathP);
            System.out.println("Nhập điểm Lý mới: ");
            double newPhysP = scanner.nextDouble();
            studentEdit.setMathPoint(newPhysP);
            System.out.println("Nhập điểm Hóa mới: ");
            double newChemP = scanner.nextDouble();
            studentEdit.setMathPoint(newChemP);
            scanner.nextLine();
            studentArrayList.set(index, studentEdit);
        }
        return studentEdit;
    }

    public Student searchStudentById(int id) {
        Student student = null;
        for (Student s : studentArrayList) {
            if (s.getId() == id) {
                student = s;
            }
        }
        return student;
    }

    public ArrayList<Student> getStudentMaxPoint() {
        ArrayList<Student> studentsMax = new ArrayList<>();
        double avgP = studentArrayList.get(0).getAveragePoint();
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() > avgP) {
                avgP = student.getAveragePoint();
            }
        }
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() == avgP) {
                studentsMax.add(student);
            }
        }
        return studentsMax;
    }

    public ArrayList<Student> sortByAvgPointAscending() {
        studentArrayList.sort(((o1, o2) -> Double.compare(o1.getAveragePoint(), o2.getAveragePoint())));
        return studentArrayList;
    }

    public ArrayList<Student> sortByAvgPointDecrease() {
        studentArrayList.sort(((o1, o2) -> Double.compare(o2.getAveragePoint(), o1.getAveragePoint())));
        return studentArrayList;
    }
}
