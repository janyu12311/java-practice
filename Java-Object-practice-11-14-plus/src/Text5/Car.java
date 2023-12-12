package Text5;

public class Car {
    private String brand;
    private int price;
    private String color;

    public Car() {
    }
    public Car(String brand, int price, String cold) {
        this.brand = brand;
        this.price = price;
        this.color = cold;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCold() {
        return color;
    }

    public void setCold(String cold) {
        this.color = cold;
    }
}
