package block2;

import myCustomAlgorithms.SortingAlgorithms;

import java.util.ArrayList;

public class Pr9 {
    private static SortingAlgorithms<Integer> myIntSort = new SortingAlgorithms<>();

    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        Integer[] arr = {0, 1, 0, 3, 2, 1, 10, 9, 8};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i < arr.length; i++)
            list.add(arr[i]);
        list = myIntSort.insertionSort(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}