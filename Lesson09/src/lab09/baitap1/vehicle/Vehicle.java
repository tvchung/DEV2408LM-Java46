package lab09.baitap1.vehicle;

import java.util.Scanner;

public class Vehicle implements  IVehicle{
    // field
    String maker;
    String model;
    double price;

    // attribute (setter / getter)
    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Constructor
    public Vehicle() {
    }
    public Vehicle(String maker, String model, double price) {
        this.maker = maker;
        this.model = model;
        this.price = price;
    }

    @Override
    public void input() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter maker: ");
        maker = inp.next();
        System.out.print("Enter model: ");
        model = inp.next();
        System.out.print("Enter price: ");
        price = inp.nextDouble();
    }

    @Override
    public void display() {
        System.out.println("===Thông tin:");
        System.out.println("Maker: " + maker);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
