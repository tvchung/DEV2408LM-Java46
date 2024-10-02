package pkgreview;
/*
Viết chương trình Java thực hiện các công việc sau:
- Tạo lớp trừu tượng Student với các trường name, year, phương thức hiển thị,
phương thức trừu tượng Average (tính trung bình điểm)
- Tạo lớp StudentCollege kế thừa từ Student và bổ sung 3 trường score1, score2,
score3. Ghi đè phương thức Average và tạo mới phương thức hiển thị.
- Tạo lớp StudentUniversity kế thừa từ StudentCollege và bổ sung 1 trường score4.
Ghi đè phương thức Average và tạo mới phương thức hiển thị.
- Trong Main viết code để test chương trình.
 */
public abstract class Student {
    protected  String name;
    protected  int year;

    public Student() {
        this.name = "";
        this.year = 0;
    }

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // phuong thức có nội dung
    public  void  hienThi(){
        System.out.println("Name:" + name);
        System.out.println("Year:" + year);
    }
    // phương thức trừu tượng Average (tính trung bình điểm)
    public  abstract float average();
}
