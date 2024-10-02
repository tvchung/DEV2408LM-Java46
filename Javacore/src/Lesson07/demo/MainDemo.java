package Lesson07.demo;


public class MainDemo {
    public static void main(String[] args) {
        Student student = new Student(100,"Devmaster",10);
        student.show();

        Lesson07.userpkg.Student stud
                = new Lesson07.userpkg.Student(200,"Dev",15);
        stud.show();
    }
}
