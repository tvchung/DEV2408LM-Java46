package Lesson07.pkgabs;

public class Circle extends Shape {
    private  float banKinh;
    private  final  float PI=3.14f;

    public  Circle(String title){
        super.title=title;
    }
    public  Circle(String title, float banKinh){
        super.title=title;
        this.banKinh=banKinh;
    }

    @Override
    public void tinhChuVi() {
        float cv = PI*banKinh;
        System.out.println("Chu vi:" + cv);
    }

    @Override
    public void tinhDienTich() {
        float dt = PI*banKinh*banKinh;
        System.out.println("Diện tích:"+dt);
    }
}
