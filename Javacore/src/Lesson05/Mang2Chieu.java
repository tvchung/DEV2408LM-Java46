package Lesson05;

import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        int row ;// = 3;
        int col ;//= 4;
        // khai báo mảng
//        int[][] arr = new int[row][col];
        // khai báo và khởi tạo giá trị
        int[][]  mang = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34}
        }; // Mảng gồm có 3 dòng và 4 côtj
        // In ra các phần tử trong mảng (matrix)
        System.out.println("\n Danh sach:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%4d",mang[i][j]);
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);
        // Nhập so dong
        System.out.println("Nhap row=");
        row = input.nextInt();
        // Nhập số cột
        System.out.println("Nhap col");
        col = input.nextInt();

        // Khai báo mảng
        int[][] arr = new int[row][col];
        System.out.println("Nhập giá trị cho cac phần tử trong mảng");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arr[%d][%d]=",i,j);
                arr[i][j] = input.nextInt();
            }
        }
        // Hiển thị
        System.out.println("\n Danh sach:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
