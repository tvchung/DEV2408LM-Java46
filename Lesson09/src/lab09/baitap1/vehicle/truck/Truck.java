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

package lab09.baitap1.vehicle.truck;

import lab09.baitap1.vehicle.Vehicle;

import java.util.Scanner;

public class Truck extends Vehicle {
    int truckload;
    public Truck() {
        super();
    }
    public Truck(int truckload) {
        super();
        this.truckload = truckload;
    }

    public Truck(String maker, String model, double price, int truckload) {
        super(maker, model, price);
        this.truckload = truckload;
    }

    public int getTruckload() {
        return truckload;
    }

    public void setTruckload(int truckload) {
        this.truckload = truckload;
    }

    @Override
    public void input() {
        super.input();
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter truckload: ");
        truckload = inp.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Truck load: " + truckload);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", Truck load='" + truckload + '\'' +
                '}';
    }
}
