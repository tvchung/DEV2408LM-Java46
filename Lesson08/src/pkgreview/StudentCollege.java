package pkgreview;
/*
- Tạo lớp StudentCollege kế thừa từ Student
và bổ sung 3 trường score1, score2,score3.
 Ghi đè phương thức Average và tạo mới phương thức hiển thị.
 */
public class StudentCollege extends Student {

    protected float score1;
    protected float score2;
    protected float score3;
    public StudentCollege(){
        super();
    }
    public StudentCollege(String name, int year, float score1, float score2, float score3){
        super(name,year);
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    @Override
    public float average() {
        return (score1+score2+score3)/3;
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("Score1:"+score1);
        System.out.println("Score2:"+score2);
        System.out.println("Score3:"+score3);
        System.out.println("Average:"+average());
    }

    @Override
    public String toString() {
        return "StudentCollege{" +
                " Name=" + name +
                " Year=" + year +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", average=" + average() +
                '}';
    }
}
