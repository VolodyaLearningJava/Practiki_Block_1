package block2;

public class Pr9 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        arr = insertionSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static int[] insertionSort(int[] arr) {
        if (arr.length == 1)
            return arr;
        int[] newArr = new int[arr.length-1];
        for (int i=0; i < newArr.length; i++) { newArr[i] = arr[i]; }
        System.out.println(newArr.length);
        newArr = insertionSort(newArr);

        if (arr[arr.length-1] < newArr[newArr.length-1]) {
            int c = arr[arr.length-1];
            arr[arr.length-1] = newArr[newArr.length-1];
            newArr[newArr.length-1] = c;
        }
        for (int i=0; i < newArr.length; i++) { arr[i] = newArr[i]; }
        return arr;
    }
}
/* Сортировка вставкой
* 1. Рассматривать меньший массив, пока не дойдём до единичного
* 2. Для текущего (возможно урезанного) массива смотрим на два правых элемента, меняем их местами, если левый из них больше
* 3. Конец итерации, алгоритм возвращвет отсортированный (возможно урезанный) массив, после чего
* */