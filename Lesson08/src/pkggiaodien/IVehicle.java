package pkggiaodien;

public interface IVehicle {
    static  final String STATEID="LA-09";

    // các phương thức trừu tượng (không cos nội dung)
    public void start();
    public void stop();
    public void brake();
    public void accelerate(int speed);
}
