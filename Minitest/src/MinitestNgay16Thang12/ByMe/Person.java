package MinitestNgay16Thang12.ByMe;

public class Person {
    private static int VALUE = 1;
    private int id;
    private String name;
    private int age;


    public Person(String name, int age) {
        this.id = VALUE;
        this.name = name;
        this.age = age;
        VALUE++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
