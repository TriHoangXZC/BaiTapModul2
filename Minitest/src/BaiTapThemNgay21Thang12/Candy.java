package BaiTapThemNgay21Thang12;

public class Candy {
    public static int VALUE = 0;
    private int id;
    private String color;
    private String nature;
    private int quantity;
    private double price;

    public Candy() {
    }

    public Candy(String color, String nature, int quantity, double price) {
        this.id = ++ VALUE;
        this.color = color;
        this.nature = nature;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", nature='" + nature + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
