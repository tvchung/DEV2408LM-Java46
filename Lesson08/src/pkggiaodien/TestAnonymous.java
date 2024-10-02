package pkggiaodien;

public class TestAnonymous {
    public static void main(String[] args) {

        Age age = new Age() {
            @Override
            public void getAge() {
                System.out.print("Age is " + x);
            }
        };
        age.getAge();

    }
}
