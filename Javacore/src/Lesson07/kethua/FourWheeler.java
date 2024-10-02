package Lesson07.kethua;
/*
    Lớp con, kế thừa từ Vehicle
 */
public class FourWheeler extends  Vehicle{
    // attribute
    private  boolean powerSteer;
    public  FourWheeler(){}
    public  FourWheeler(String vId, String vName,
                        int nWheels, boolean powerSteer){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = nWheels;
        this.powerSteer = powerSteer;
    }

    public  void showDetail(){
        System.out.println("Vehicle No" + vehicleNo);
        System.out.println("Vehicle Name:" + vehicleName);
        System.out.println("Wheels: " + wheels);
        System.out.println("PowerSteer:" + powerSteer);
    }

    // phương thức ghi đè override
    public void  accelerate(int speed){
        super.accelerate(speed); // dùng lại của lớp cha
        System.out.println("FourVehicle Accelerate at:" + speed + " kmph");
    }
    // test main
    public static void main(String[] args) {
        FourWheeler fourWheeler
                = new FourWheeler("A001","ABC", 4, true);

        fourWheeler.showDetail();
        fourWheeler.accelerate(1000); // sử dụng phương thức từ lớp cha
//        fourWheeler.show(); // private

        Vehicle fourWheeler1 = new FourWheeler();
        fourWheeler1.accelerate(100);

        ((FourWheeler)fourWheeler1).showDetail();

        System.out.println("==================");
        Vehicle fourVehicle2
                = new FourWheeler("A001","ABC", 4, true);

        fourVehicle2.accelerate(200);
        ((FourWheeler)fourVehicle2).showDetail();


    }
}
