package Lesson07.kethua;
/*
    Lớp cơ sở / lớp cha
 */
public class Vehicle {
    // attribute
    protected  String vehicleNo;
    protected  String vehicleName;
    protected int wheels;
//    protected  int speed;

    // method
    public  void  accelerate(int speed){
        System.out.println("Accelerate at:" + speed + "kmph");
    }

    private  void show(){
        System.out.println(vehicleName);
    }
}
