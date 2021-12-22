package BaiTapThemNgay20Thang12;

public class Dog extends Animal implements AnimalMethod {
    public Dog(String name, int age, int weight) {
        super(name, age, weight);
    }

    public Dog() {
    }

    @Override
    public int run() {
        return 60;
    }

    @Override
    public String makeSound() {
        return "Gâu gâu";
    }

    public void lookMyHouse() {
        System.out.println("Chó biết trông nhà!");
    }

    public void display() {
        System.out.printf("%-20s", "Dog");
        System.out.printf("%-20S", super.getName());
        System.out.printf("%-20s", super.getAge());
        System.out.printf("%s", super.getWeight());
        System.out.println();
    }
}
