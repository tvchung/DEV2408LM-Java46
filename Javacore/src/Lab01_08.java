import java.util.Scanner;

/*
Bài 8: Tìm max, min của 3 số được nhập vào từ bàn phím
 */
public class Lab01_08 {
    public static void main(String[] args) {
        // Khai báo biến
        int num1, num2, num3, max, min;
        Scanner input  = new Scanner(System.in);
        System.out.print("\n Nhập num1=");
        num1=input.nextInt();
        System.out.print("\n Nhập num2=");
        num2=input.nextInt();
        System.out.print("\n Nhập num3=");
        num3=input.nextInt();
        // Tìm max, min
        max = Math.max(num1, Math.max(num2,num3));
        int min1 = (num1>num2)?num2:num1;
        min = (min1>num3)?num3:min1;

        System.out.printf("\n Num1:%d, num2:%d, num3:%d, \n Max=%d, Min=%d",
                num1,num2,num3,max,min);

    }
}
