package pkggiaodien;

public class TwoWheeler implements IVehicle, IManufacturer {
    String ID; // variable to store vehicle ID
    String type; // variable to store vehicle type

    public TwoWheeler(String ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void brake() {
        System.out.println("brake");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("accelerate: " + speed);
    }


    @Override
    public void addContact(String detail) {
        System.out.println("addContact");
    }

    @Override
    public void callManufacturer(String phone) {
        System.out.println("callManufacturer");
    }

    @Override
    public void makePayment(float amount) {
        System.out.println("makePayment");
    }
}
