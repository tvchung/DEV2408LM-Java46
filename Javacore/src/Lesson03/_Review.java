package Lesson03;

import java.util.Scanner;

/*
Lab03 - Bai tap
Bài 9: In ra 1 menu lựa chọn. Dùng SWITCH-CASE để thực hiện các menu đó. Ví
dụ:
Cuối tuần bạn muốn làm gì?
1. Đi học Java
2. Đi chơi Công viên ngắm gấu.
3. Đi (về) nhà nghỉ
4. Ra sông Hồng tắm tiên
5. Ngủ cả ngày.
6. Thoát. (System.exit(0))
Lặp đi lặp lại việc lựa chọn trên.
 */
public class _Review {
    public static void main(String[] args) {
        int chon=0;
        Scanner input=new Scanner(System.in);
        do{
            menu();
            System.out.print("\n Chon:");
            chon = input.nextInt();
            switch (chon){
                case 1:
                    System.out.println("1. Đi học Java");
                    break;
                case 2:
                    System.out.println("2. Đi chơi Công viên ngắm gấu");
                    break;
                case 3:
                    System.out.println("3. Đi (về) nhà nghỉ");
                    break;
                case 4:
                    System.out.println("4. Ra sông Hồng tắm tiên");
                    break;
                case 5:
                    System.out.println("5. Ngủ cả ngày");
                    break;
                case 6:
                    System.out.println("6. Kết thúc ");
                    break;
                default:
//                    throw new IllegalStateException("Unexpected value: " + chon);
                    System.out.println("Bạn chọn sai chức năng!");
            }
        }while (chon!=6);
    }

    public  static  void  menu(){
        System.out.println("Cuối tuần bạn làm gì?");
        System.out.println("1. Đi học java");
        System.out.println("2. Đi chơi Công viên ngắm gấu");
        System.out.println("3. Đi (về) nhà nghỉ");
        System.out.println("4. Ra sông Hồng tắm tiên");
        System.out.println("5. Ngủ cả ngày");
        System.out.println("6. Kết thúc ");
    }
}
