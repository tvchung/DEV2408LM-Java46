package Lesson02;

public class Lab03_04 {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i; j++) {
                if(j==0 || i==n || i-1==j){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i < n; i++) {
            // in khoảng trắng
            for (int j = 0; j <i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");
        for (int i = 0; i <n; i++) {
            // in khoảng trắng
            for (int j = 0; j <n-i-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//        int t = add(5);
//        System.out.println(t);
    }

//    public  static  int add(int n){
//        int tong=0;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j < n; j++) {
//                if(j==5){
//                   return  1000;
//                }else{
//                    return tong;
//                }
//            }
//        }
}
/*
i=2;
    j=0, 1 => **

 */