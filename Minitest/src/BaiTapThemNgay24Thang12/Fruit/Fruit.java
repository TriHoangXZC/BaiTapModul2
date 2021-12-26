package BaiTapThemNgay24Thang12.Fruit;

public class Fruit {
    private String kind;
    private double weight;
    private String taste;
    private String color;
    private double price;

    public Fruit() {
    }

    public Fruit(String kind, double weight, String taste, String color, double price) {
        this.kind = kind;
        this.weight = weight;
        this.taste = taste;
        this.color = color;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
