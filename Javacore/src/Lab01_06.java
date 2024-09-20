/*

Bài 6: Nhập 2 số nguyên n1, m1 ; 2 số thực n2, m2 từ bàn phím. Tính tổng của 2
số nguyên, tổng của 2 số thực, tính tổng của n1+n2 và hiển thị các kết quả ra
màn hình.
 */
import  java.util.Scanner;
public class Lab01_06 {
    public static void main(String[] args) {
        // Khai baó biến
        int n1, m1;
        float n2,m2;
        // Nhập giá trị tu bàn phím
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số nguyên n1=");
        n1=input.nextInt();
        System.out.print("Nhập số nguyên m1=");
        m1=input.nextInt();
        System.out.print("Nhập số thực n2=");
        n2=input.nextFloat();
        System.out.print("Nhập số thực m2=");
        m2=input.nextFloat();

        //Tính
        int tong2SoNguyen = n1+m1;
        float tong2SoThuc=n2+m2;
        float tongN1N2 = n1+n2;

        // Hiển thị
        System.out.printf("\n Tổng: %d + %d = %d",n1,m1,tong2SoNguyen);
        System.out.printf("\n Tổng: %.2f + %.2f = %.2f",n2,m2,tong2SoThuc);
        System.out.printf("\n Tổng: %d + %.2f = %.2f",n1,n2,tongN1N2);
    }
}
