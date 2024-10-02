package pkggiaodien;

public class NestClassTest {
    public static void main(String[] args) {
        ClassOuter outer =  new ClassOuter("Lop ngoai",111);
        System.out.println(outer.toString());

        ClassOuter.ClassInner inner = new ClassOuter.ClassInner("Lop trong",222);
        System.out.println(inner.toString());


    }
}
