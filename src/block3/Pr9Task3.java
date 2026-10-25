package block3;

import block2.Student;
import myCustomAlgorithms.SortingAlgorithms;

import java.util.ArrayList;

public class Pr9Task3 {
    public static void task3(ArrayList<Student> arr1, ArrayList<Student> arr2) {
        SortingAlgorithms<Student> myStudSort = new SortingAlgorithms<>();
        arr1.addAll(arr2);
        myStudSort.mergeSort(arr1);
    }
}
