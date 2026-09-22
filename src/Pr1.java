import java.util.Scanner;

public class Pr1 {
    public static void punkt3() {
        int[] array = {1, 2, 3, 10, 53, 123};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элементов: " + sum + '\n' + "Среднее арифметическое: " + sum / (float)array.length);
    }

    public static void punkt4while(){
        Scanner scanner = new Scanner(System.in);
        int ln, cur, sum=0, sr;
        int[] arr = {};

        System.out.print("Введите длину последовательности: ");
        ln = scanner.nextInt();
        cur = ln;
        while (cur > 0) {
            System.out.print("Введите " + Integer.toString(ln*2-cur) + " элемент: ");
            int element = scanner.nextInt();
            arr = addToArr(arr, element);
            sum += element;
            cur--;
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое элементов: " + sum/(float)ln);
        System.out.println("Минимальный элемент: " + minEl(arr));
        System.out.println("Максимальный элемент: " + maxEl(arr));
    }
    public static void punkt4dowhile(){
        Scanner scanner = new Scanner(System.in);
        int ln, cur, sum=0, sr;
        int[] arr = {};

        System.out.print("Введите длину последовательности: ");
        ln = scanner.nextInt();
        cur = ln;
        do {
            System.out.print("Введите " + Integer.toString(ln*2-cur) + " элемент: ");
            int element = scanner.nextInt();
            arr = addToArr(arr, element);
            sum += element;
            cur--;
        } while (cur > 0);

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое элементов: " + sum/(float)ln);
        System.out.println("Минимальный элемент: " + minEl(arr));
        System.out.println("Максимальный элемент: " + maxEl(arr));
    }

    public static void punkt5(String[] args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

    public static void punkt6() {
        // Пусть 1/n**2 - наш ряд
        for (float i = 1; i <= 10; i++) {
            System.out.println(1/(i*i));
        }
    }

    public static void punkt7() {
        Scanner scanner = new Scanner(System.in);
        int mult=1;
        System.out.print("Введите желаемый факториал: ");

        for (int i = scanner.nextInt(); i > 0; i--){
            mult *= i;
        }

        System.out.println("Факториал: " + mult);
    }

    private static int[] addToArr(int[] arr, int x) {
        int[] newarr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++)
            newarr[i] = arr[i];

        newarr[arr.length] = x;
        return newarr;
    }
    private static int minEl(int[] arr){
        if (arr.length == 0) return 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    private static int maxEl(int[] arr){
        if (arr.length == 0) return 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}