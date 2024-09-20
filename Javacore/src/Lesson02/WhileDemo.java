package Lesson02;
/*
- In ra thông tin:
- Cho biến num=1; in ra 5 lần giá trị của num*10; mỗi lần in num tăng lên 1
 */
public class WhileDemo {
    public static void main(String[] args) {
        int num=1;
        while (num<=5){
            System.out.printf("\n %d * 10 = %d", num, num*10 ); // in
            num++; // tăng biến điều kiện lăp
        }

        // in ra các số nguyên từ 1 đến 10
        num=1;
        while (num<=10){
            System.out.println(num);
            num++;
        }

        // test:
        boolean flag=false;
        while (flag=!flag){
            System.out.println(flag);
        }
        //output:true
    }
}
