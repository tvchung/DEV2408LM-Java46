package Lesson05;

import java.util.Scanner;

public class Lab06_01 {
    public static void main(String[] args) {
        String[] arrSinhVien = new String[3];
        Scanner input = new Scanner(System.in);
        // Nhập
        for (int i = 0; i < 3; i++) {
            System.out.printf("Nhap sinh vien thu %d",i);
            arrSinhVien[i] = input.nextLine();
        }
        //Hien thị
        for (int i = 0; i < 3; i++) {
            System.out.println(arrSinhVien[i]);
        }
    }
}
