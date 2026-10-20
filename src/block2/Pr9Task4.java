package block2;

import java.util.Scanner;

public class Pr9Task4 {
    public interface MyComparable<T> {
        public int compareTo(T obj); // returns -1, 0 or 1
    }
    public static class ComparTest implements MyComparable<ComparTest> {
        private int value;
        public ComparTest(int val) { this.value = val; }
        public int getValue() { return value; }

        @Override
        public int compareTo(ComparTest obj) {
            if (obj.getValue() < this.value)
                return -1;
            if (obj.getValue() > this.value)
                return 1;
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Введите значение 2: ");
        int val2 = scanner.nextInt();
        ComparTest test1 = new ComparTest(val1), test2 = new ComparTest(val2);
        switch (test1.compareTo(test2)) {
            case -1:
                System.out.println("Первое занчение больше");
                break;
            case 1:
                System.out.println("Второе значение больше");
                break;
            default:
                System.out.println("Значения равны");
                break;
        }
    }
}
