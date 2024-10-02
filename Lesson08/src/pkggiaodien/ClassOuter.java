package pkggiaodien;

public class ClassOuter {
    protected  String name;
    private int year;

    ClassOuter(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "ClassOuter{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    // ClassInner
    public static class  ClassInner {
        private String name;
        private int year;
        public ClassInner(String name, int year) {
            this.name = name;
            this.year = year;
        }

        @Override
        public String toString() {
            return "ClassInner{" +
                    "name='" + name + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

    // Main test

    public static void main(String[] args) {
        ClassOuter outer = new ClassOuter("Lop ngoai",123);
        System.out.println(outer.toString());

        ClassInner inner = new ClassInner("Lop Trong", 222);
        System.out.println(inner.toString());
    }
}
