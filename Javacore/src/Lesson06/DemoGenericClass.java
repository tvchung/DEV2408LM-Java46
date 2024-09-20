package Lesson06;

public class DemoGenericClass<T> {
    public  T bienKieuT;
    public  void  set(T value){
        bienKieuT  =value;
    }
    public  T get(){
        return  bienKieuT;
    }
    // Sử dụng (test)
    public static void main(String[] args) {
        DemoGenericClass<Integer> dgcI = new DemoGenericClass<Integer>();
        dgcI.set(100);
        System.out.println("Gia tri dgcI:" + dgcI.get());
        DemoGenericClass<Float> dgcF = new DemoGenericClass<Float>();
        // gán giá trị
        dgcF.set(1234.56f);
        System.out.println("Giá trị dgcF:" + dgcF.get());
        DemoGenericClass<String> dgcS = new DemoGenericClass<String>();
        dgcS.set("Chung Trịnh");
        System.out.println("Name:" + dgcS.get());

        DemoGenericClass<Student> dgcStudent =  new DemoGenericClass<Student>();
        Student student = new Student(100,"Devmaster",10);
        dgcStudent.set(student);
        dgcStudent.get().show();

        //student.show();
    }
}
