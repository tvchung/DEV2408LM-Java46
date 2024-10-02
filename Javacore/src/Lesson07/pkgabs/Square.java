package Lesson07.pkgabs;

public class Square extends Shape{

    private  float canh;

    public Square(String title, float canh){
        super.title = title;
        this.canh=canh;
    }
    @Override
    public void tinhChuVi() {
        float cv = 4*canh;
        System.out.println("Chu vi:"+cv);
    }

    @Override
    public void tinhDienTich() {
        float dt = canh*canh;
        System.out.println("Dien thich:"+dt);
    }
}
