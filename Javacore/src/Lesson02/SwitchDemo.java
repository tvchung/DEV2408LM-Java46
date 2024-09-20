package Lesson02;

import java.util.Scanner;

/*
    - Nhập vào tháng, năm
    -> Tính số ngày trong tháng, năm đó

    ví dụ: thang=8, nam=2024 => soNgay=31

    31: 1,3,5,7,8,10,12
    30: 4,6,9,11
    28, 29: 2

 */
public class SwitchDemo {
    public static void main(String[] args) {
        // Khai báo biến
        int thang, nam, soNgay=0;
        // nhập
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập tháng:");
        thang=input.nextInt();
        System.out.print("Nhập năm:");
        nam=input.nextInt();
        // Tính số ngay trong thang, nam
        switch (thang){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay=30;
                break;

            case 2:
                if((nam % 4==0 && nam % 100!=0) || nam % 400 == 0){
                    soNgay=29;
                }else{
                    soNgay=28;
                }
                break;
            default:
                System.out.println("Nhập sai dữ liệu tháng, năm");
        } // ./end switch

        // in ra màn hình
        if(soNgay>0){
            System.out.printf("\n Tháng %d, năm %d có %d ngày!",thang, nam, soNgay);
        }
    }
}
/*
    bài tập:
    1. đọc một số có 1 chữ số thành lời việt: 1-> một
    2. đọc một số có 2 chữ số thành lời việt:
        10-> mười
        11-> mười môtj
        15-> muoi lam
    3. đọc một số có 3 chữ số thành lơ việt
 */