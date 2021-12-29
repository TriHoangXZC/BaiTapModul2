package BaiTapThemNgay29Thang12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> studentArrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.studentArrayList = new ArrayList<>();
    }

    public Student creatStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double avgPoint = scanner.nextDouble();
        scanner.nextLine();
        return new Student(name, age, gender, address, avgPoint);
    }

    public void addStudent(Student student) {
        studentArrayList.add(student);
    }

    public void displayAllStudent() {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public Student deleteStudentByName(String name) {
        Student student = null;
        for (Student s : studentArrayList) {
            if (s.getName().equals(name)) {
                student = s;
                break;
            }
        }
        if (student != null) {
            studentArrayList.remove(student);
        }
        return student;
    }

    public Student editStudentByName(String name) {
        Student studentUpdate = null;
        for (Student s : studentArrayList) {
            if (s.getName().equals(name)) {
                studentUpdate = s;
                break;
            }
        }
        if (studentUpdate != null) {
            int index = studentArrayList.indexOf(studentUpdate);
            System.out.println("Nhập tên mới: ");
            String newName = scanner.nextLine();
            studentUpdate.setName(newName);
            System.out.println("Nhập tuổi mới: ");
            int newAge = scanner.nextInt();
            studentUpdate.setAge(newAge);
            scanner.nextLine();
            System.out.println("Nhập giới tính mới: ");
            String newGender = scanner.nextLine();
            studentUpdate.setAddress(newGender);
            System.out.println("Nhập địa chỉ mới: ");
            String newAdd = scanner.nextLine();
            studentUpdate.setAddress(newAdd);
            System.out.println("Nhập điểm trung bình mới: ");
            double newAvgPoint = scanner.nextDouble();
            studentUpdate.setAveragePoint(newAvgPoint);
            scanner.nextLine();
            studentArrayList.set(index, studentUpdate);
        }
        return studentUpdate;
    }

    public ArrayList<Student> displayAllStudentAvgPointHigherThanSevenDotFive() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() > 7.5) {
                students.add(student);
            }
        }
        return students;
    }

    public ArrayList<Student> displayAllStudentGood() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() > 8) {
                students.add(student);
            }
        }
        return students;
    }

    public ArrayList<Student> displayAllStudentRather() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() <= 8 && student.getAveragePoint() > 6) {
                students.add(student);
            }
        }
        return students;
    }

    public ArrayList<Student> displayAllStudentMedium() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() > 4.5 && student.getAveragePoint() <= 6) {
                students.add(student);
            }
        }
        return students;
    }

    public ArrayList<Student> displayAllStudentWeak() {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() <= 4.5) {
                students.add(student);
            }
        }
        return students;
    }

    public void exportCsv() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/BaiTapThemNgay29Thang12/test.csv"))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tên,");
            sb.append("Tuổi,");
            sb.append("Giới tính,");
            sb.append("Địa chỉ,");
            sb.append("Điểm trung bình");
            sb.append("\n");

            if (studentArrayList.size() > 0) {
                for (Student student : studentArrayList) {
                    sb.append(student.getName());
                    sb.append(",");
                    sb.append(student.getAge());
                    sb.append(",");
                    sb.append(student.getGender());
                    sb.append(",");
                    sb.append(student.getAddress());
                    sb.append(",");
                    sb.append(student.getAveragePoint());
                    sb.append("\n");
                }
            }
            bufferedWriter.write(sb.toString());
            System.out.println("Write successfully");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

