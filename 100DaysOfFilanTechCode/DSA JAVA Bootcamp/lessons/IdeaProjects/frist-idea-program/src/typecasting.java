import java.util.Scanner;

public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num= input.nextFloat();
//        System.out.println(num);

        //type costing
//        int num = (int)(67.56f);
//        System.out.println(num);

//        // automatic type promotion in expression
//        int a = 257;
//        byte b= (byte) (a);
//        System.out.println(b);
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d =(a*b) / c;
//        System.out.println(d);
//        byte b=50;
//        b=b*2;

//        int number ='A';
//        System.out.println(number);

        byte b =42;
        char c ='a';
        short s= 1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);
        //float +int_double=double
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);





    }
}
