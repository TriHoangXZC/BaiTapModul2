package MinitestNgay30Thang12;

public class Student extends Human {
    private double mathPoint;
    private double physicsPoint;
    private double chemistryPoint;

    public Student(String name, int age, double mathPoint, double physicsPoint, double chemistryPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
    }

    public Student(double mathPoint, double physicsPoint, double chemistryPoint) {
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
    }


    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }



    public double getAveragePoint() {
        return (mathPoint + physicsPoint + chemistryPoint) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", age=" + getAge() +
                ", mathPoint=" + mathPoint +
                ", physicsPoint=" + physicsPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", averagePoint=" + getAveragePoint() +
                '}';
    }
}
