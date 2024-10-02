package Lesson07.pkgabs;
// lớp cơ sử trưủ tượng

public abstract class Shape {
    // attribute (có thể co hoặc không
    protected  String title;
    // method
    /// có nội dung: có thể có hoặc không
    public  void showTitle(){
        System.out.println("Welcome to," + title);
    }

    /// không có nội dung abstract
    public abstract void  tinhChuVi();
    public  abstract void tinhDienTich();
}
