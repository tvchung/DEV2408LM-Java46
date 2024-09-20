package Lesson06;

import java.util.Scanner;

public class _ReviewMang {
    public static void main(String[] args) {
        Student[] students = new Student[100];
        //int[] arr = new int[10]; arr[0] = 11;
        int n; // số lượng sinh viên (n<100)
        // Nhập vào số lượng sinh viên
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n=input.nextInt();

        // Nhập thong tin cho từng sinh viên
        for (int i = 0; i <n; i++) {
            System.out.println("Nhập sinh viên thu:" + (i+1));
            // students[i] = new Student();
            // students[i].id=?
            Student student = new Student();
            System.out.print("Nhap id:");
            student.id = input.nextInt();
            input.nextLine();
            System.out.print("Nhap name:");
            student.name = input.nextLine();
            System.out.print("Nhap age:");
            student.age = input.nextInt();
            //Bỏ vào mảng
            students[i] = student;
        }
        // Hien thi
        System.out.println("Danh sach sinh vien");
//        for (Student item: students){
//            item.show();
//        }
        for (int i = 0; i < n; i++) {
            students[i].show();
        }
    }
}
