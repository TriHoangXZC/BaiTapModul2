package MinitestNgay23Thang12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PersonManager {
    ArrayList<Person> personArrayList;
    Scanner scanner = new Scanner(System.in);

    public PersonManager() {
        this.personArrayList = new ArrayList<>();
    }

    public Person creatPerson(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            return new Person(name, age);
        } else if (choice == 2) {
            System.out.println("Nhập điểm môn toán: ");
            double mathPoint = scanner.nextDouble();
            System.out.println("Nhập điểm môn lý: ");
            double physicsPoint = scanner.nextDouble();
            System.out.println("Nhập điểm môn hóa: ");
            double chemistryPoint = scanner.nextDouble();
            return new Student(name, age, mathPoint, physicsPoint, chemistryPoint);
        }
        return null;
    }

    public void addPerson(Person person) {
        personArrayList.add(person);
    }

    public void displayAll() {
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }

    public Person searchById(int id) {
        for (Person person : personArrayList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person deleteById(int id) {
        Person person = null;
        for (Person p : personArrayList) {
            if (p.getId() == id) {
                person = p;
            }
        }
        personArrayList.remove(person);
        return person;
    }

    public Person editById(int id) {
        Person personUpdate = null;
        Student studentUpdate = null;
        for (Person person : personArrayList) {
            if (person.getId() == id && person instanceof Student) {
                studentUpdate = (Student) person;
            } else if (person.getId() == id) {
                personUpdate = person;
            }
        }
        if (personUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            personUpdate.setName(name);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            personUpdate.setAge(age);
            scanner.nextLine();
            return personUpdate;
        } else if (studentUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            studentUpdate.setName(name);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            studentUpdate.setAge(age);
            scanner.nextLine();
            System.out.println("Nhập điểm toán mới: ");
            double mathPoint = scanner.nextDouble();
            studentUpdate.setMathPoint(mathPoint);
            System.out.println("Nhập điểm lý mới: ");
            double physicsPoint = scanner.nextDouble();
            studentUpdate.setPhysicsPoint(physicsPoint);
            System.out.println("Nhập điểm hóa mới: ");
            double chemistryPoint = scanner.nextDouble();
            studentUpdate.setChemistryPoint(chemistryPoint);
            scanner.nextLine();
            return studentUpdate;
        }
        return null;
    }

    public void sortByAveragePoint() {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        for (Person person : personArrayList) {
            if (person instanceof Student) {
                students.add((Student) person);
            } else {
                persons.add(person);
            }
        }
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAveragePoint() < o2.getAveragePoint()) {
                    return 1;
                } else if(o1.getAveragePoint() > o2.getAveragePoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        persons.addAll(students);
        personArrayList = persons;
        System.out.println("Sắp xếp thành công");
    }
}
