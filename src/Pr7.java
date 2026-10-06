import java.lang.Math;
import java.util.Scanner;

public class Pr7 {
    public void task4() {
        System.out.println("Пример математики: " + MathFunc.calculateCircleLength(1));
    }
    private interface MathCalculable {
        public static final float PI = 3.14f;
        public static float power(float n, int j) { // n - число, j - степень
            float c = 1;

            for (int i=0; i < j; i++)
                c *= n;
            if (c != 1) return c;

            for (int i=0; i > j; i--)
                c /= n;
            return c;
        }
        public static float complAbs(float a, float b) {
            return (float)Math.sqrt(a*a + b*b);
        }
    }
    private static class MathFunc implements MathCalculable {
        public static float calculateCircleLength(float radius) {
            return 2 * PI * radius;
        }
    }

    public void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        System.out.println("Длина строки: " + Vring.len(str));
        System.out.println("Нечётные символы: " + Vring.nechetChars(str));
        System.out.println("Строка в обратную сторону: " + Vring.reversedString(str));
    }
    private interface Vring {
        public static int len(String str) { return str.length(); }
        public static String nechetChars(String str) {
            String newStr = "";
            for (int i=0; i < str.length(); i++) {
                if ((i+1) % 2 == 1)
                    newStr += str.charAt(i);
            }
            return newStr;
        }
        public static String reversedString(String str) {
            String newStr = "";
            for (int i=0; i < str.length(); i++)
                newStr += str.charAt(str.length() - 1 - i);
            return newStr;
        }
    }
}
