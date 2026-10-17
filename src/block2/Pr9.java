package block2;

public class Pr9 {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int[] arr = {0, 1, 0, 3, 2, 1, 10, 9, 8};
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
        newArr = insertionSort(newArr);

        if (arr[arr.length-1] < newArr[newArr.length-1]) {
            int c = arr[arr.length-1];
            arr[arr.length-1] = newArr[newArr.length-1];
            newArr[newArr.length-1] = c;

            //System.out.println("Element " + (newArr.length) + ", bring back " + c);
            newArr = insertionSort(newArr);
        }
        for (int i=0; i < newArr.length; i++) { arr[i] = newArr[i]; }
        //System.out.println("Go fwd");
        return arr;
    }
}
/* Сортировка вставкой
* 1. Рассматривать меньший массив, пока не дойдём до единичного
* 2. Для текущего (возможно урезанного) массива смотрим на два правых элемента, меняем их местами, если левый из них больше
* 3. Конец итерации, алгоритм возвращвет отсортированный (возможно урезанный) массив, после чего
* */