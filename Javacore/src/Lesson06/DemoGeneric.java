package Lesson06;

public class DemoGeneric {
    public static void main(String[] args) {
        Integer[] inArr = {12,22,21,44};
        Float[] ftArr = {1.2f,2.2f,3.4f};
        String[] strArr = {"Hung","Dung","Sang"};
        Character[] chArray = {'H','e','l','l','o'};
        printArray(inArr);
        System.out.println("===========");
        printArray(ftArr);
        printArray(strArr);
        printArray(chArray);
    }

    // Method Generic
    public  static  <T> void  printArray(T[] inputArray){
        System.out.println("Danh sách");
        for (T item: inputArray){
            System.out.println(item);
        }
    }
}
