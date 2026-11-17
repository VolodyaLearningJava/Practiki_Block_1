package block4;

import block3.Akkerman;

import java.util.Scanner;

public class Pr18 {
    public static void main(String[] args) {
        Exception4.exceptionDemo();
    }
    public static class Exception1_1 {
        public static void exceptionDemo() {
            System.out.println( 2 / 0 );
        }
    }
    public static class Exception1_2 {
        public static void exceptionDemo() {
            try{
                System.out.println( 2/0 );
            } catch ( ArithmeticException e ) {
                System.out.println("Attempted division by zero");
            }
        }
    }
    public static class Exception2 {
        public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i;
            try {
                i = Integer.parseInt(intString);
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input");
                return;
            }
            System.out.println( 2/i );
        }
    }
    public static class Exception3 {
        public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i;
            try {
                i = Integer.parseInt(intString);
                System.out.println( 2/i );
            }
            catch (Exception e) {
                System.out.println("Invalid input, here's Akkerman(1, 1): " + Akkerman.akkermanFunction(1, 1));
            }
        }
    }
    public static class Exception4 {
        public static void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in);
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i;
            try {
                i = Integer.parseInt(intString);
                System.out.println( 2/i );
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
            finally {
                System.out.println("Bye-bye");
            }
        }
    }
    public static class ThrowsDemo {
        /*public static void getDetails(String key) {
            if(key == null) {
                try {
                    throw new NullPointerException(); // спросить
                }
                catch (NullPointerException e) {
                    System.out.println("Ошибка");
                }
            }
            // do something with the key
        }*/
    }
    public class NullPointerException extends Exception {
        public NullPointerException() { super("Нет ссылки на ключ"); }
        public NullPointerException(String message) {
            super(message);
        }
    }
}
