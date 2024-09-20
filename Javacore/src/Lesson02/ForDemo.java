package Lesson02;

public class ForDemo {
    public static void main(String[] args) {
        // in ra cac so nguyen tu 1-10
        // Dạng 1: for đầy đủ:
        System.out.println("\nFor đầy đủ:");
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%3d",i);
        }

        // Dạng 2: For khuyết
        System.out.println("\nFor khuyết init:");
        int i = 1;
        for (; i <=10 ; i++) {
            System.out.printf("%3d",i);
        }
        System.out.println("\nFor khuyết codition:");
        i = 1;
        for (; ; i++) {
            System.out.printf("%3d",i);
            if(i==10) break;
        }
        System.out.println("\nFor khuyết step:");
        i = 1;
        for (; i<=10; ) {
            System.out.printf("%3d",i);
            //if(i==10) break;
            i++;
        }
        // Dạng 3: for khuyết toàn bộ
        System.out.println("\nFor khuyết toàn bộ:");
        i = 1;
        for(;;){
            System.out.printf("%3d",i);
            i++;
            if(i>10) break;
        }

        // Dạng 4: for không thân
        System.out.println("\nFor không thân:");
        for(i=1; i<=10;System.out.printf("%3d",i), i++ );

        // Lệnh nhảy: break; continue; return; exit;
        // continue
        // in ra các số nguyên tu 1 đến 10
        // Nhưng không in số 5
        System.out.println("\n Không in số 5:");
        for(i=1; i<=10; i++){
            if(i==5) continue;
            System.out.printf("%3d",i);
        }
    }
}
