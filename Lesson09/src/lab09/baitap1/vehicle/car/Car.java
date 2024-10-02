/*
Câu 3 : Tạo 2 lớp Car và Truck thừa kế từ lớp Vehicles,
 Lớp Car nằm trong package vehicle.car, lớp Truck nằm trong
package vehicle.truck.
 Lớp Car có thêm 1 thuộc tính color kiểu String. Lớp Truck có thêm
một thuộc tính truckload kiểu int.
 Lớp Car có 2 phương thức ghi đè là input và display, trong đó có sử
dụng (nhập và xuất) thêm thuộc tính color. Lớp Truck có 2 phương
thức ghi đè là input và display, trong đó có sử dụng (nhập và xuất)
thêm thuộc tính truckload.

 */
package lab09.baitap1.vehicle.car;

import lab09.baitap1.vehicle.Vehicle;

import java.util.Scanner;

public class Car extends Vehicle {
    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car() {
    }

    public Car(String maker, String model, double price, String color) {
        super(maker, model, price);
        this.color = color;
    }

    @Override
    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = input.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Color: " + color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                "color='" + color + '\'' +
                '}';
    }
}
