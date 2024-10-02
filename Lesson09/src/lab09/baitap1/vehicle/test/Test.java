/*
Câu 4 : Tạo lớp Test nằm trong package vehicle.test, thực hiện công việc sau:
 In ra menu:
1. Input
2. Display
3. Sort by price
4. Search by model.
5. Exit
 Khi người dùng chọn 1, nhập thông tin vào cho mảng 3 đối tượng
Car và mảng 3 đối tượng Truck.
 Khi người dùng chọn 2, hiển thị toàn bộ thông tin của 3 Car và 3
Truck.
 Khi người dùng chọn 3, hiển thị danh sách các xe trước khi sắp xếp
và sau khi sắp xếp theo giá.
 Khi người dùng chọn 4, người dùng sẽ phải nhập vào 1 chuỗi, sau
đó chương trình in ra dối tượng có model đó.
 Khi chọn 5, kết thúc chương trình. Thoát và trở về HDH.
 */
package lab09.baitap1.vehicle.test;

import lab09.baitap1.vehicle.Vehicle;
import lab09.baitap1.vehicle.car.Car;
import lab09.baitap1.vehicle.truck.Truck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<Vehicle>();
        int chon = 0;
        Scanner inp = new Scanner(System.in);
        do{
            menu();
            System.out.print("\n Chọn:");
            chon = inp.nextInt();
            switch(chon){
                case 1:
                    System.out.println("Chon 1: Input");
                    //Khi người dùng chọn 1, nhập thông tin vào cho mảng 3 đối tượng
                    //Car và mảng 3 đối tượng Truck.
                    /*
                    System.out.println("Chon 1: Input Car");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Car thu: " + (i+1));
                        Car car = new Car();
                        car.input();
                        list.add(car);
                    }
                    System.out.println("Chon 1: Input Truck");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Truck thu: " + (i+1));
                        Truck truck = new Truck();
                        truck.input();
                        list.add(truck);
                    }
                    */
                    list.add(new Car("C1","C1",111,"C1"));
                    list.add(new Car("C2","C2",222,"C1"));
                    list.add(new Car("C2","C2",333,"C1"));
                    list.add(new Truck("T1","T1",444,1));
                    list.add(new Truck("T2","T2",555,2));
                    list.add(new Truck("T3","T3",555,3));
                    break;
                case 2:
                    System.out.println("Chon 2: Display");
                    for (Vehicle vehicle : list) {
                        vehicle.display();
                        //System.out.println(vehicle.toString());
                    }
                    break;
                case 3:
                    System.out.println("Chon 3: Sort by price");
                    System.out.println("=====Trước khi sắp xếp");
                    for (Vehicle vehicle : list) {
                        System.out.println(vehicle.toString());
                    }
                    //sort
                    Collections.sort(list,(x1,x2)->(x1.getPrice()>x2.getPrice())?-1:(x1.getPrice()<x2.getPrice()?1:0));
                    System.out.println("=====Sau khi sắp xếp");
                    for (Vehicle vehicle : list) {
                        System.out.println(vehicle.toString());
                    }

                    //Bubble Sort
//                    for (int i = 0; i < list.size()-1; i++) {
//                        for (int j = i+1; j < list.size(); j++) {
//                            if (list.get(i).getPrice() > list.get(j).getPrice()) {
//                                Vehicle temp = list.get(i);
//                                list.set(i, list.get(j));
//                                list.set(j, temp);
//                            }
//                        }
//                    }
                    break;
                case 4:
                    System.out.println("Chon 4: Search by...");
                    System.out.println("Input model search:");
                    inp.nextLine();
                    String model = inp.nextLine();
                    for (Vehicle vehicle : list) {
                        if(vehicle.getModel().toLowerCase().contains(model.toLowerCase())){
                            System.out.println(vehicle.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Chon 5: Exit");
                    break;
                default:
                    System.out.println("Invalid chon");
            }
        }while (chon!=5);
    }
    static void  menu(){
        System.out.println("====MENU====");
        System.out.printf("\n1. Input \n" +
                "2. Display\n" +
                "3. Sort by price\n" +
                "4. Search by model.\n" +
                "5. Exit");
    }
}
