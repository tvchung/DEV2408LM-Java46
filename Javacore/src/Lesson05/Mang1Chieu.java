package Lesson05;

import java.util.Random;

/*
- Mảng một chiều:
+ Khai báo, khai báo và khởi tạo kích thước của mảng
+ Truy cập đến các phần tử trong mảng
++ gán giá trị
++ lấy giá trị
+ Sắp xếp, tìm kiếm, các thao tác chèn, xóa ,...

 */
public class Mang1Chieu {
    public static void main(String[] args) {
        // Khai báo,...
        int[] array;
        // Khởi tạo kích thước của mảng
        array = new int[10]; // index: 0,1,...,9
        // gán giá trị cho các phần tử trong mảng
        array[0] = 10;
        array[5] = 20;
        array[9] = 30;
        // duyệt mảng và lấy giá trị để hiển thị
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d",array[i]);
        }

        // gán giá trị ngẫu nhiên cho các phần tử trong mảng
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            Random rand = new Random();
            array[i] = rand.nextInt(99);
            System.out.printf("%4d",array[i]);
        }

        // Sắp xếp tăng dần
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 9; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        //  in mảng đã săp
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%4d",array[i]);
        }
    }

}
