package block2;

import myCustomAlgorithms.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Pr9 {
    private static SortingAlgorithms<Student> myIntSort = new SortingAlgorithms<>();

    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
        Integer[] arr = {0, 7, 1, 3, 2, 10, 5, 9, 4, 8, 6};
        ArrayList<Student> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++)
            list.add(new Student(arr[i]));

        list = myIntSort.insertionSort(list);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
    public static void task2() {
        Integer[] arr = {0, 7, 1, 3, 2, 10, 5, 9, 4, 8, 6};
        ArrayList<Student> list = new ArrayList<>();
        for (int i=0; i<arr.length; i++)
            list.add(new Student(arr[i]));

        list = myIntSort.quickSort(list);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}