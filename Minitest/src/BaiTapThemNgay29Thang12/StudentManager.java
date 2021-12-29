package BaiTapThemNgay29Thang12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/BaiTapThemNgay29Thang12/students.csv";
    private final ArrayList<Student> studentArrayList;
    private final Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        this.studentArrayList = readFile(PATH_NAME);
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public boolean checkAgeAndAverage(int age, double averagePoint) {
        return (age >= 18 && age <= 60 && averagePoint >= 0 && averagePoint <= 10);
    }

    public String getGenderByChoice(int choice) {
        String gender = "";
        switch (choice) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = " Other";
                break;
        }
        return gender;
    }

    public void addStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Chọn giới tính: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.println("3. Other");
        System.out.println("Nhập lựa chọn của bạn: ");
        int gender = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        double avgPoint = scanner.nextDouble();
        scanner.nextLine();
        if (checkAgeAndAverage(age, avgPoint) && !getGenderByChoice(gender).equals("")) {
            studentArrayList.add(new Student(name, age, getGenderByChoice(gender), address, avgPoint));
            writeFile(studentArrayList, PATH_NAME);
            System.out.println("Thêm sinh viên có tên:  " + name + " thành công!");
        } else {
            System.out.println("Lỗi, vui lòng nhập lại!!!");
        }
    }


    public void displayAllStudent() {
        if (studentArrayList.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }
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
            writeFile(studentArrayList, PATH_NAME);
            System.out.println("Xóa sinh viên tên: " + name + " thành công!");
        }
        return student;
    }

    public Student editStudentByName(String name) {
        Student studentEdit = null;
        for (Student s : studentArrayList) {
            if (s.getName().equals(name)) {
                studentEdit = s;
                break;
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
            scanner.nextLine();
            System.out.println("Chọn giới tính mới: ");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.println("3. Other");
            System.out.println("Nhập lựa chọn của bạn: ");
            int gender = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập địa chỉ mới: ");
            String newAdd = scanner.nextLine();
            studentEdit.setAddress(newAdd);
            System.out.println("Nhập điểm trung bình mới: ");
            double newAvgPoint = scanner.nextDouble();
            studentEdit.setAveragePoint(newAvgPoint);
            scanner.nextLine();
            if (checkAgeAndAverage(studentEdit.getAge(), studentEdit.getAveragePoint()) && !getGenderByChoice(gender).equals("")) {
                studentEdit.setGender(getGenderByChoice(gender));
                studentArrayList.set(index, studentEdit);
                writeFile(studentArrayList, PATH_NAME);
                System.out.println("Sửa thông tin sinh viên có tên:  " + name + " thành công!");
            } else {
                System.out.println("Lỗi, vui lòng nhập lại!!!");
            }
        }
        return studentEdit;
    }

    public void displayAllStudentAvgPointHigherThanSevenDotFive() {
        if (studentArrayList.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng");
            return;
        }
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() > 7.5) {
                System.out.println(student);
            }
        }
    }


    public void displayStudentFormat() {
        if (studentArrayList.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
            return;
        }
        for (Student student : studentArrayList) {
            if (student.getAveragePoint() > 8.0) {
                System.out.println(student.getName() + " - " + student.getAveragePoint() + " - " + "Good");
            } else if (student.getAveragePoint() > 6.0) {
                System.out.println(student.getName() + " - " + student.getAveragePoint() + " - " + "Pretty");
            } else if (student.getAveragePoint() > 4.0) {
                System.out.println(student.getName() + " - " + student.getAveragePoint() + " - " + "Normal");
            } else {
                System.out.println(student.getName() + " - " + student.getAveragePoint() + " - " + "Weak");
            }
        }
    }

    public void writeFile(ArrayList<Student> studentArrayList, String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : studentArrayList) {
                bufferedWriter.write(student.getName() + ", " + student.getAge() + ", " + student.getGender() + ", " +
                        student.getAddress() + ", " + student.getAveragePoint() + "\n");
            }
            bufferedWriter.close();
            System.out.println("Ghi file thành công!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public ArrayList<Student> readFile(String path) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        File file = new File(PATH_NAME);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(", ");
                studentArrayList.add(new Student(strings[0], Integer.parseInt(strings[1]), strings[2], strings[3], Double.parseDouble(strings[4])));
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return studentArrayList;
    }
}

