package Lesson07.userpkg;

public class Student {
    private  int id;
    private  String name;
    private  int age;
    public Student(){}
    public Student(int id, String name, int age){
        this.id = id;
        this.name=name;
        this.age=age;
    }

    public  void show(){
        System.out.printf("\n %5d %-20s %5d", id, name, age);
    }
}
