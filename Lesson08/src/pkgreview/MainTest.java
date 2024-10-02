package pkgreview;

public class MainTest {
    public static void main(String[] args) {
        Student student = new StudentCollege();
        student.name="Devmaster";
        student.year=10;
        student.hienThi();
        System.out.println("================");

        student = new StudentUniversity();
        student.name="University";
        student.year=10;
        student.hienThi();

        StudentCollege studentCollege = new StudentCollege("Nguyễn A",10,8,9,8);
        studentCollege.hienThi();
        System.out.println(studentCollege.toString());

        StudentUniversity studentUniversity
                =new StudentUniversity("Nguyễn Văn B",15,9,9,8,9) ;
        studentUniversity.hienThi();

        System.out.println(studentUniversity.toString());
    }
}
