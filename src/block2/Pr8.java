package block2;

import java.util.Scanner;

public class Pr8 { // 14 по номеру в группе
    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.print("Введите натуральное число: ");
            i = scanner.nextInt();
        } while (i <= 0);
        t14Digits(i);
        System.out.println();
    }
    private static void t14Digits(int i) {
        if (i <= 0) return;
        int a = i % 10;
        t14Digits(i / 10);
        System.out.print(a + " ");
    }

    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.print("Введите натуральное число: ");
            i = scanner.nextInt();
        } while (i <= 0);
        t15Digits(i);
        System.out.println();
    }
    private static void t15Digits(int i) {
        if (i <= 0) return;
        int a = i % 10;
        System.out.print(a + " ");
        t15Digits(i / 10);
    }

    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        int i, mx=0, mxCount=-1;
        System.out.println("Введите натуральные числа в качестве элементов последовательности (при вводе 0, цикл завершается и выводится результат): ");
        do {
            do {
                i = scanner.nextInt();
            } while (i < 0);
            if (i == mx) {
                mxCount += 1;
            }
            else if (i > mx) {
                mx = i;
                mxCount = 1;
            }
        } while (i != 0);
        System.out.println("Количество максимальный элементов: " + mxCount);
    }
}
