/*
 *  Description: 异常 demo
 *  User: Shepard Wang
 *  Date: 2020 -06 -11
 *  Time: 9:03
 */

import java.util.Scanner;

class MyException extends RuntimeException{

    public MyException(){
        super();
    }

    public MyException(String message) {
        super(message);
    }
}

public class TestDemo1 {

    public static double divide (double a, double b) throws MyException{
        if(b == 0.0){
            throw new MyException("divisor is zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double x = 0.0;
        try{
             x = divide(a, b);
             System.out.println(a + "/" + b + " = " + x);
        }
        catch(MyException e){
            e.printStackTrace();
        }
        finally {

        }

    }


    public static void func(){
        int[] array = new int[]{1, 2, 3};
        int a = array[3];
    }

    public static void main1(String[] args) {

        try {
            func();
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("catch");
        }
        finally{
            System.out.println("finally");
        }


        System.out.println("end");
    }
}

