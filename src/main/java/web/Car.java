package web;

public class Car {
    String model;
    String colour;
    int price;

    public Car(String model, String colour, int price) {
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car " +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price;
    }
}

