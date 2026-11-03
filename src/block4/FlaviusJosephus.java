package block4;

import java.util.Scanner;

public class FlaviusJosephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;
        do {
            System.out.print("Введите натуральное число n: ");
            n = scanner.nextInt();
        } while (n < 1);
        do {
            System.out.print("Введите натуральное число m: ");
            m = scanner.nextInt();
        } while (m < 1);

        if (m == 1) { // Единственный случай, при котором все умирают за один проход по списку
            System.out.println("Номер последнего выжившего - " + n);
            return;
        }

        boolean[] arr = new boolean[n];
        for (int i=0; i<n; i++) arr[i]=true;
        int curM = 0;
        for (int i=0; true;) {
            if (arr[i]) curM++;
            if (curM == m) {
                arr[i] = false;
                curM = 0;
            }

            i++;
            if (i >= n) {
                i = 0;
                if (isOneLeft(arr)) break; // так получилось куда более оптимально, чем делать преверку каждую итерацию, но с i = (i + 1) % n
            }
        }
        for (int i=0; i < n; i++) {
            if (arr[i]) {
                System.out.println("Номер последнего выжившего - " + (i+1));
                return;
            }
        }
    }
    private static boolean isOneLeft(boolean[] arr) {
        int c = 0;
        for (int i=0; i < arr.length; i++) {
            if (arr[i]) c++;
            if (c > 1) return false;
        }
        return true;
    }
}
