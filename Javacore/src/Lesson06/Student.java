package Lesson06;

public class Student {
    // attribute
    public  int id;
    public  String name;
    public  int age;
    // constructor
    public Student(){}
    public  Student(int id, String name, int age){
        this.id = id;
        this.name =name;
        this.age=age;
    }
    // method
    public  void show(){
        System.out.printf("\n %4d %15s %4d",id, name, age);
    }

    //test
    public static void main(String[] args) {
        Student student = new Student(123,"Devmaster",10);
        student.show();
    }
}
