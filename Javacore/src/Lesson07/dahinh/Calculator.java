package Lesson07.dahinh;

public class Calculator {

    public void add(int a, int b){
        System.out.printf("\n %d + %d = %d",a,b, a+b);
    }

    public void add(int a, int b, int c){
        System.out.printf("\n %d + %d + %d = %d",a,b,c, a+b+c);
    }

    public void add(float a, float b){
        float c=a+b;
        System.out.printf("\n %f + %f = %.2f",a,b, c);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(100,200);
        calculator.add(1,2,3);
        calculator.add(10.2f,11.2f);
    }
}
