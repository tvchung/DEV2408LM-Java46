package Lesson07.pkgabs;

public class MainTest {
    public static void main(String[] args) {
//        Shape shape  = new Shape();
        Circle circle = new Circle("Lớp hinh tron",10);
        circle.showTitle();
        circle.tinhChuVi();
        circle.tinhDienTich();

        Shape shape = new Square("Hinh vuong",100);
        shape.showTitle();
        shape.tinhChuVi();
        shape.tinhDienTich();

        shape = new Circle("Hinh tron",15);
        shape.showTitle();
        shape.tinhChuVi();
        shape.tinhDienTich();
    }
}
