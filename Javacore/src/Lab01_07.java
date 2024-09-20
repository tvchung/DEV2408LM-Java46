import java.util.Scanner;

/*
Bài 7: Tìm max, min của 2 số được nhập vào từ bàn phím
 */
import  java.util.Scanner;
public class Lab01_07 {
    public static void main(String[] args) {
        // khai báo biến
        int num1, num2, max, min;
        Scanner input  = new Scanner(System.in);
        System.out.print("\n Nhập số num1=");
        num1=input.nextInt();
        System.out.print("\n Nhập số num2=");
        num2=input.nextInt();
        // Tìm max, min
        if(num1>num2){
            max=num1;
            min=num2;
        }else{
            max=num2;
            min=num1;
        }
        System.out.println("\n Max="+ max + "\n Min="+min);

        max=(num1>num2)?num1:num2;
        min=(num1>num2)?num2:num1;
        System.out.println("\n Max="+ max + "\n Min="+min);
    }
}
