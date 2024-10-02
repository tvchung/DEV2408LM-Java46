package pkgreview;
/*
- Tạo lớp StudentUniversity kế thừa từ StudentCollege và bổ sung 1 trường score4.
Ghi đè phương thức Average và tạo mới phương thức hiển thị.
 */
public class StudentUniversity extends StudentCollege{
    protected float score4;
    public  StudentUniversity(){
        super();
    }

    public StudentUniversity(String name, int year, float score1, float score2, float score3, float score4) {
        super(name, year, score1, score2, score3);
        this.score4 = score4;
    }

    @Override
    public float average() {
        return (super.average()+score4)/2;
    }

    public  void  hienThi(){
        super.hienThi();
        System.out.println("Score4:" + score4);
        System.out.println("Average:" + average());
    }

    @Override
    public String toString() {
        return super.toString() +
                ",score4:" + score4 +
                ", average:" + average();
    }

}
