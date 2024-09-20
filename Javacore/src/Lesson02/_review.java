package Lesson02;

import java.util.Scanner;

public class _review {
    public static void main(String[] args) {
        // Review: I/O; Biến, hằng, kiểu dữ liuj, biểu thức, toán tử, toán hạng, câu lệnh...
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a=");
        int a  = input.nextInt();
        System.out.print("Nhập b=");
        float b  = input.nextFloat();
        System.out.print("Nhập họ tên:");
        input.nextLine();
        String name = input.nextLine();

        // in ra màn hình
        System.out.println("Xin chào, " + name);
        System.out.printf("\n Tổng: %d + %.2f = %.2f",a,b, a+b);
    }

}
