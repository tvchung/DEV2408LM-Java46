package Lesson03;

import java.util.Scanner;

public class Student {
    //1.   Field / attribute / properties / state
    int rollNumber;
    String name;
    int yearOfBirth;

    //2. method / behavior
    // constructor
    public  Student(){}
    public  Student(int rollNumber, String name, int yearOfBirth){
        this.rollNumber = rollNumber;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    // inputInfo - Nhâp thông tin
    public  void  inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n Nhập rollNumber = ");
        rollNumber = input.nextInt();
        input.nextLine();
        System.out.print("\n Nhâp name=");
        name = input.nextLine();
        System.out.print("\n Nhâp Year of Birth =");
        yearOfBirth = input.nextInt();
    }
    // output
    public  void  outputInfo(){
        System.out.println("\n ===Thông tin sinh viên");
        System.out.println("rollNumber = " + rollNumber);
        System.out.println("Name = " + name);
        System.out.println("Year of Birth = " + yearOfBirth);
    }

    // method: main test
    public static void main(String[] args) {
        // Khởi tạo đối tường từ lớp
        Student obj = new Student();
        // Truy cập đến phương thức cuar đối tượng (.)
        obj.inputInfo();
        obj.outputInfo();

        // Truy cập đến biến
        obj.name = "Chung Trịnh";
        obj.outputInfo();

        // Sử dụng hàm khởi tạo có tham số
        obj = new Student(111,"Devmaster",2013);
        obj.outputInfo();
    }
}
