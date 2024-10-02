package Lesson07.demo;
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
        System.out.println(id);
        System.out.println(name);
        System.out.println(age);
    }
}
