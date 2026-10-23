package block3;

import java.util.Scanner;

public class Akkerman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n;
        do {
            System.out.print("Введите неотрицательное целое число m: ");
            m = scanner.nextInt();
        } while (m < 0);
        do {
            System.out.print("Введите неотрицательное целое число n: ");
            n = scanner.nextInt();
        } while (n < 0);

        System.out.print("Результат работы функции Аккермана: " + akkermanFunction(m, n));
    }

    public static int akkermanFunction(int m, int n) {
        if (m <= 0) return n + 1;
        if (n <= 0) return akkermanFunction(m-1, 1);
        return akkermanFunction(m-1, akkermanFunction(m, n-1));
    }
}
