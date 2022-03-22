package io.codelex.Exceptions_practice;

public class Exercise2 {

    public static void main(String[] args) {
        methodA();
        throw new ArithmeticException();
    }
    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (Exception e){
            System.out.println("Error in B");
        }
        throw new ArithmeticException();
    }

    public static void methodB() throws ArithmeticException {
        try{
            methodC();
        } catch (Exception e){
            System.out.println("Error in C");
        }
        throw new ArithmeticException();
    }

    public static void methodC() throws ArithmeticException {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error");
        }
        throw new ArithmeticException();
    }

}
