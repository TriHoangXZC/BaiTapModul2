package MinitestNgay16Thang12.ByMe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PersonManager implements PersonManagerInterface {
    Scanner scanner = new Scanner(System.in);

    public PersonManager(ArrayList<Person> personArrayList) {
    }

    @Override
    public void displayPerson(ArrayList<Person> personArrayList) {
        for (Person person : personArrayList) {
            if (person != null) {
                System.out.println(person);
            }
        }
    }


    @Override
    public void addPerson(ArrayList<Person> personArrayList, Person person) {
        personArrayList.add(person);
    }

    @Override
    public Person searchById(ArrayList<Person> personArrayList, int id) {
        for (Person person : personArrayList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person deletePersonById(ArrayList<Person> personArrayList, int id) {
        Person person = null;
        for (Person p : personArrayList) {
            if (p.getId() == id) {
                person = p;
            }
        }
        personArrayList.remove(person);
        return person;
    }


    @Override
    public Person editInformationById(ArrayList<Person> personArrayList, int id) {
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
            if (name.equals(" ")) {
                personUpdate.setName(personUpdate.getName());
            } else {
                personUpdate.setName(name);
            }
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            personUpdate.setAge(age);
            return personUpdate;
        } else if (studentUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String name = scanner.nextLine();
            studentUpdate.setName(name);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            studentUpdate.setAge(age);
            System.out.println("Nhập điểm mới: ");
            double averagePoint = scanner.nextDouble();
            studentUpdate.setAveragePoint(averagePoint);
            scanner.nextLine();
            return studentUpdate;
        }
        return null;
    }


    @Override
    public void sortByAveragePoint(ArrayList<Person> personArrayList) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        ArrayList<Person> personArrayList1 = new ArrayList<>();
        for (Person person : personArrayList) {
            if (person instanceof Student) {
                studentArrayList.add((Student) person);
            } else {
                personArrayList1.add(person);
            }
        }
        studentArrayList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAveragePoint() < o2.getAveragePoint()) {
                    return 1;
                } else if (o1.getAveragePoint() > o2.getAveragePoint()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        personArrayList1.addAll(studentArrayList);
        personArrayList = personArrayList1;
        System.out.println("Sắp xếp thành công!!!");
    }

    @Override
    public double totalAveragePoint(ArrayList<Person> personArrayList) {
        double totalPoint = 0;
        for (Person person : personArrayList) {
            if (person instanceof Student) {
                totalPoint += (((Student) person).getAveragePoint());
            }
        }
        return totalPoint;
    }

    @Override
    public double totalAverage(ArrayList<Person> personArrayList) {
        double totalPoint = 0;
        int count = 0;
        for (Person person : personArrayList) {
            if (person instanceof Student) {
                totalPoint += (((Student) person).getAveragePoint());
                count++;
            }
        }
        return totalPoint / count;
    }


}
