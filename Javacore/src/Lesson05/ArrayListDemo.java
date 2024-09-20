package Lesson05;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Demo arraylist
        ArrayList arrayList = new ArrayList<>();
        // thêm phần tử
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        System.out.println("Danh sách các phần tử");
        for (var item : arrayList){
            System.out.println(item);
        }
        System.out.println("Danh sách các phần tử");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
