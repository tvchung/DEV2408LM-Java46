package Lesson04;
/*
    class
       field (state)
       constructor (method)
       method (Behavior)
    object


 */
public class _Review {
    // field (state)
//    private int id;
     int id;

    String name;
    int age;
    // Constructor - Hàm khởi tạo (Mặc định class sẽ có constructor không tham số)
    public _Review(){}
    public  _Review(int id, String name, int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    // method: print
    public  void printReview(){
        System.out.println("================");
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) {
        // khởi tạo đối tuong
        _Review rw = new _Review();
        rw.printReview(); // truy cap den phuong cua doi tuong

        rw = new _Review(100,"Devmaster",5);
        rw.printReview();// truy cap den phuong cua doi tuong

        // truy cap den field
        rw.id = 200;
        rw.name="Chung Chung";
        rw.age=45;

        rw.printReview();


    }
}
